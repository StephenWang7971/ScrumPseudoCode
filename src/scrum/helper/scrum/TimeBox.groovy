package scrum.helper.scrum

class TimeBox {
    int length;  //in unit of days.
    int elapsed;

    boolean isExpired() {
        return elapsed >= length
    }
}
