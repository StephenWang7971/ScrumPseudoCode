package scrum._3355.role

import scrum._3355.artifacts.Incremental
import scrum._3355.artifacts.ProductBacklog
import scrum.helper.exceptions.NotYourResponsibilityException
import scrum.helper.scrum.ProductBacklogItem


class ProductOwner {

    def prioritize(ProductBacklog productBacklog) {

    }

    def adjust(ProductBacklog productBacklog) {
        ProductBacklogItem[] productBacklogItems
        addItem(productBacklog, productBacklogItems)
        removeItem(productBacklog, productBacklogItems)
        prioritize(productBacklog)
    }

    def removeItem(ProductBacklog productBacklog, ProductBacklogItem[] productBacklogItems) {

    }

    def addItem(ProductBacklog productBacklog, ProductBacklogItem[] productBacklogItems) {
    }

    def release() {

    }

    def removeFinishedItems(ProductBacklog productBacklog) {

    }

    def lead(Team team) {
        throw  new NotYourResponsibilityException()
    }

    def makeReleaseDecision(Incremental incremental) {
        //Maybe Release, maybe not ,up to PO.
    }
}
