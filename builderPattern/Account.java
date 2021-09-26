package builderPattern;

public class Account {
    private final int id;
    private final String email;
    private String address;
    private String name;

    // Constructor using Builder Pattern
    private Account(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.address = builder.address;
        this.name = builder.name;
    }

    public static class Builder {
        private final int id;
        private final String email;
        private String address;
        private String name;

        public Builder(int id, String email) {
            this.id = id;
            this.email = email;
        }

        public Builder setId(String address) {
            this.address = address;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }

    public int getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }
}
