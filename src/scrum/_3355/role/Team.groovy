package scrum._3355.role

import scrum._3355.artifacts.Incremental
import scrum.helper.exceptions.NotYourResponsibilityException
import scrum.helper.other.Impediment
import scrum.helper.other.TeamMember
import scrum.helper.scrum.Velocity


class Team {

    int size  //TODO constraint 5-9
    Velocity velocity

    TeamMember[] members = new TeamMember[size]

    def Incremental develop() {
        Incremental small = new Incremental()
        return small
    }

    def makeDecision(TeamMember teamMember) {

    }

    def reportDelay(ProductOwner productOwner, ScrumMaster scrumMaster) {

    }

    def report(Impediment [] impediments, ScrumMaster scrumMaster) {

    }

    def release() {
        throw new NotYourResponsibilityException()
    }
}
