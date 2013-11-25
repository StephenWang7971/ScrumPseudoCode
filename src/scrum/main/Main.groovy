package scrum.main

import scrum._3355.artifacts.ProductBacklog
import scrum._3355.role.ProductOwner
import scrum._3355.role.ScrumMaster
import scrum._3355.role.Team
import scrum.helper.scrum.Scrum


class Main {

    def static main(String[] args) {
        Scrum scrum = Scrum.getInstance();
        //NOTE How to hire your team, product owner and scrum master is out of scope of Scrum.
        scrum.productOwner = new ProductOwner()
        scrum.team = new Team()
        scrum.scrumMaster = new ScrumMaster()

        scrum.productBacklog = new ProductBacklog()

        scrum.run()
    }
}
