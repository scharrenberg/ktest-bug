public enum ThingWithProperty {

    SimpleThingWithProperty,

    ThingWithOverriddenProperty {
        @Override
        public String getGreeting() {
            return "Hi";
        }
    };

    public String getGreeting() {
        return "Hello";
    }

}
