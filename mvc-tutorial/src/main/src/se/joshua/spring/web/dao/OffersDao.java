package se.joshua.spring.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */

// context:package-scan use this annotation to find bean
@Component("offersDao")
public class OffersDao {

    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    public void setDataSource(DataSource jdbc) {
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }

    public OffersDao() {
        System.out.println("Dao has been loaded by spring contextLoader");
    }

    public List<Offer> getOffers() {

        return jdbc.query("select * from offers ", new RowMapper<Offer>() {
            @Override
            public Offer mapRow(ResultSet resultSet, int i) throws SQLException {
                Offer offer = new Offer();

                offer.setId(resultSet.getInt("id"));
                offer.setName(resultSet.getString("name"));
                offer.setEmail(resultSet.getString("email"));
                offer.setText(resultSet.getString("text"));
                return offer;
            }
        });
    }

    public Offer getOffer(int id) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);

        return jdbc.queryForObject("select * from offers where id=:id", params,
                new RowMapper<Offer>() {

                    public Offer mapRow(ResultSet rs, int rowNum)
                            throws SQLException {
                        Offer offer = new Offer();

                        offer.setId(rs.getInt("id"));
                        offer.setName(rs.getString("name"));
                        offer.setText(rs.getString("text"));
                        offer.setEmail(rs.getString("email"));

                        return offer;
                    }

                });
    }

    /**
     * @param offers, all offer will be inserted or not. if operation fails it will be rollback start state
     * @return
     */
    @Transactional
    public int[] create(List<Offer> offers) {

        SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offers.toArray());

        return jdbc.batchUpdate("insert into offers (id, name, text, email) values (:id, :name, :text, :email)", params);
    }

    public boolean create(Offer offer) {
        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
        return jdbc.update("insert into offers (name, text, email) values (:name, :text, :email)", params) == 1;
    }


}
