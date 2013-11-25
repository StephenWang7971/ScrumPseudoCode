package scrum._3355.ceremonies

import scrum.helper.other.Attendee
import scrum.helper.other.ScrumMeeting
import scrum.helper.scrum.Scrum


class PlanningMeeting  extends ScrumMeeting {

    def init() {

        Scrum scrum = Scrum.getInstance()

        attendees[0] = new Attendee(scrum.team,  Attendee.Show.MUST)
        attendees[1] = new Attendee(scrum.scrumMaster,  Attendee.Show.MUST)
        attendees[2] = new Attendee(scrum.productOwner,  Attendee.Show.MUST)
    }

    def hold() {
        Scrum scrum = Scrum.getInstance()
    }
}
