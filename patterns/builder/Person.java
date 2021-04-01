package patterns.builder;

public class Person {

    private String name;
    private String email;
    private String address;
    private int age;

    public Person(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
        this.email = builder.email;
    }

    public static class Builder {

        private final String name;
        private final String email;
        private String address;
        private int age;

        public Builder(String name, String email) {

            this.name = name;
            this.email = email;
        }

        /**
         * build method
         * 
         * @return
         */
        public Person build() {

            return new Person(this);
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        return name + " " + email+" "+address+" "+age;

    }

}
