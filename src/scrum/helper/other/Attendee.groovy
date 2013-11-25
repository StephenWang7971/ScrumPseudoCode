package scrum.helper.other

import javax.management.relation.Role

class Attendee {
    Role role;
    Show show;

    enum Show {
     MUST, OPTIONAL, NOT_NEEDED;
    }
}
