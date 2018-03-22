package com.openkm.extension.frontend.client;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.openkm.frontend.client.extension.widget.tabworkspace.TabWorkspaceExtension;

public class TabHTMLWorkspace extends TabWorkspaceExtension{

	private VerticalPanel vPanel;
	
	private String sampleHtml = "";
	private String TAB_NAME_TAG = "custom.tab.workspace.name";
	private String tabName = "";
	
	/**
	 * TabHTMLWorkspace
	 */
	public TabHTMLWorkspace() {
		
		sampleHtml = "<h2>Welcome to HTML Custom Workspace</h2><\br>";
		sampleHtml += "<strong>This page content can be modified and implemented according to requirement</strong><\br>";
		sampleHtml += "<i>by: Yousuf Zaman</i>";
		
		vPanel = new VerticalPanel();
		vPanel.add(new HTML(sampleHtml));
		vPanel.setStyleName("okm-Input");
		try{
			tabName = "HTML Panel YZ";//ConfigDAO.getString(TAB_NAME_TAG, "DefaultHTMLPanel");
		} catch(Exception ex){
			System.out.println("TabHTMLWorkspaceYZ: "+ex.getMessage());
		}
		
		initWidget(vPanel);
	}
	
	@Override
	public String getTabText() {
		// TODO Auto-generated method stub
		return tabName;
	}

	@Override
	public void setTab(TabBar tabBar, int tabIndex) {
		// TODO Auto-generated method stub
		
	}

}
