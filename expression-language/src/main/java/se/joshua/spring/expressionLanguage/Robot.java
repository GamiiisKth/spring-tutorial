package se.joshua.spring.expressionLanguage;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */
public class Robot {

    /**
     * the idea behind expression language is
     *
     <bean id="robot" class="se.joshua.spring.expressionLanguage.Robot">
     <property name="id" value="123"/>
     <property name="speech" value="i am a robot"/>
     </bean>

     that we using in common value="balalal"
     but we can use ' value= #{}' to assign value to id property

     the assign value can be a return value from a other method which can bee assign to it

     SEE the xml file
     */

    private String id="default robot";
    private String speech="hello";


    public void speak(){
        System.out.println(id+ ":" + speech);
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }
}
