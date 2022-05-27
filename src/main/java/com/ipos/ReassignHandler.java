package com.ipos;

public class ReassignHandler implements WorkItemHandler {

	@Override
	public void executeWorkItem(WorkItem workItem,
			WorkItemManager workItemManager) {
		workItemManager.completeWorkItem(workItem.getId(), new HashMap<>());
	}

	@Override
	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
	}

	public ReassignHandler() {
	}
}