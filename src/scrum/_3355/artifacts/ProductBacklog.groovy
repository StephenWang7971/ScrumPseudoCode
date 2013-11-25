package scrum._3355.artifacts

import scrum.helper.scrum.ProductBacklogItem


class ProductBacklog {

    List<ProductBacklogItem> items = new ArrayList<ProductBacklogItem>()

    boolean isEmpty() {
         return items.size() == 0
    }

}
