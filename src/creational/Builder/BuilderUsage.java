package creational.Builder;

public class BuilderUsage{
    private final String first;
    private final String second;
    private final String third;
    private BuilderUsage(Builder builder){
        this.first = builder.first;
        this.second = builder.second;
        this.third = builder.third;
    }

    public void display(){
        if(first!= null){
            System.out.println(first);
        }
        if(second!= null){
            System.out.println(second);
        }
        if(third!= null){
            System.out.println(third);
        }
    }
    public static class Builder {
        private String first;
        private String second;
        private String third;
        public Builder setFirst(String first){
            this.first = first;
            return this;
        }
        public Builder setSecond(String second){
            this.second = second;
            return this;
        }
        public Builder setThird(String third){
            this.third = third;
            return this;
        }
        public BuilderUsage build(){
            return new BuilderUsage(this);
        }

    }


}
