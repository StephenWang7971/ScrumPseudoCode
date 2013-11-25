package scrum.helper.scrum

import scrum._3355.artifacts.Incremental
import scrum._3355.artifacts.ProductBacklog
import scrum._3355.ceremonies.RetrospectiveMeeting
import scrum._3355.ceremonies.ReviewMeeting
import scrum._3355.ceremonies.Sprint
import scrum._3355.role.ProductOwner
import scrum._3355.role.ScrumMaster
import scrum._3355.role.Team
import scrum.helper.scrum.chart.ReleaseBurnDown
import scrum.helper.scrum.chart.ReleaseBurnUp


class Scrum {
    ProductOwner productOwner
    Team    team
    ScrumMaster scrumMaster

    private static Scrum instance = new Scrum()

    ProductBacklog productBacklog;

    Sprint[] sprints;

    ReleaseBurnDown releaseBurnDown
    ReleaseBurnUp releaseBurnUp

    static def getInstance() {
        return instance;
    }

    def init() {
        productOwner.prioritize(productBacklog)
        asynchronized.start()

    }

    Thread asynchronized = new Thread() {
        public void run() {
            productOwner.adjust(productBacklog)
        }
    }

    def run() {
        int next = 0
        while(!productBacklog.isEmpty()) {
            Incremental big = sprints[next].run();
            next ++;
            if (releaseBurnUp) {
                releaseBurnUp.update()
            }
            if (releaseBurnDown) {
                releaseBurnDown.update()
            }
            productOwner.removeFinishedItems(productBacklog)
            productOwner.makeReleaseDecision(big);
        }
    }

}
