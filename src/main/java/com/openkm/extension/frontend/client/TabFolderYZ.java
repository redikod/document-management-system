package com.openkm.extension.frontend.client;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.openkm.frontend.client.bean.GWTFolder;
import com.openkm.frontend.client.extension.event.HasFolderEvent;
import com.openkm.frontend.client.extension.event.HasFolderEvent.FolderEventConstant;
import com.openkm.frontend.client.extension.event.handler.FolderHandlerExtension;
import com.openkm.frontend.client.extension.widget.tabfolder.TabFolderExtension;

public class TabFolderYZ extends TabFolderExtension implements FolderHandlerExtension {

	VerticalPanel vPanel;
	private String sampleHtml = "";
	private String tabName = "";
	
	public TabFolderYZ() {
		
		sampleHtml = "<h2>Welcome Tab Folder</h2><\br>";
		sampleHtml += "<strong>Content Can be added here.</strong><\br>";
		sampleHtml += "<i>by: Yousuf Zaman</i>";
		tabName = "YZ Custom Tab";
		
		vPanel = new VerticalPanel();
		vPanel.add(new HTML(sampleHtml));

		initWidget(vPanel);
	}
	
	@Override
	public String getTabText() {
		// TODO Auto-generated method stub
		return tabName;
	}

	@Override
	public void set(GWTFolder doc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVisibleButtons(boolean visible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onChange(FolderEventConstant event) {
		if (event.equals(HasFolderEvent.TAB_CHANGED)) {
			Window.alert("YZ Tab changed - " + event.getType());
		}
		
	}

}
