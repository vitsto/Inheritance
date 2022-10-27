package animals;

public enum MovementType {
    EARTH, AIR;

    @Override
    public String toString() {
        switch (this){
            case EARTH:
                return "земля";
            case AIR:
                return "воздух";
            default:
                return "undefined";
        }
    }
}
