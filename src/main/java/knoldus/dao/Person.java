package knoldus.dao;

import org.springframework.data.annotation.Id;

/**
 * The type Person.
 */
public class Person {
	
	@Id
   // @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
    	this.id = id;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
    	this.name = name;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
    	this.age = age;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
