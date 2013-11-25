package scrum._3355.ceremonies

import com.sun.org.apache.xml.internal.dtm.ref.IncrementalSAXSource
import scrum._3355.artifacts.Incremental
import scrum._3355.artifacts.SprintBacklog
import scrum.helper.scrum.Scrum
import scrum.helper.scrum.TimeBox
import scrum.helper.scrum.chart.SprintBurnDown


class Sprint {
    TimeBox timeBox

    SprintBacklog[] sprintBacklogs

    SprintBurnDown sprintBurnDown

    DailyScrumMeeting dailyScrumMeeting
    ReviewMeeting reviewMeeting
    RetrospectiveMeeting retrospectiveMeeting

    def run() {
        Incremental incremental = new Incremental()
        while(!timeBox.isExpired()) {
            oneDayWork(incremental)
            timeBox.elapsed ++
        }
        reviewMeeting.hold()
        retrospectiveMeeting.hold()
        return incremental
    }

    private void oneDayWork(Incremental incremental) {
        Scrum scrum =  Scrum.getInstance()
        dailyScrumMeeting.hold()
        Incremental small = scrum.team.develop()
        incremental.add(small)
        if (sprintBurnDown) {
            sprintBurnDown.update()
        }
    }
}
