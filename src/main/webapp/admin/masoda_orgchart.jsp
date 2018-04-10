<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.openkm.core.Config" %>
<%@ page import="com.openkm.servlet.admin.BaseServlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <link rel="Shortcut icon" href="favicon.ico" />
  <link rel="stylesheet" href="css/style.css" type="text/css" />
  <script src="https://jvloenen.home.xs4all.nl/orgchart/orgchart.js" type="text/javascript"></script>
  <title>MASODA OrgChard</title>
</head>
<body>

	<table cellpadding="0" cellspacing="0" align="center">
		<tr>
			<td valign="center">
				<h2>Sample Org. Chart.</h2>
			</td>
		</tr>
		<tr>
			<td>
				<canvas id="c_nodes" width="800" height="320">Your browser does not support canvas!</canvas>	
			</td>
		</tr>
	</table>
  
  
<script type="text/javascript">
var o = new orgChart();

o.addNode(1, '', '', 'Root node');
o.addNode(2, 1, 'u', 'u-node 1');
o.addNode(3, 1, 'u', 'u-node 2');
o.addNode(4, 1, 'u', 'u-node 3');
o.addNode(5, 1, 'l', 'l-node 1');
o.addNode(6, 1, 'l', 'l-node 2');
o.addNode(7, 1, 'r', 'r-node 1');
o.addNode(8, 1, 'r', 'r-node 2');
o.addNode(9, 1, 'r', 'r-node 3');

o.addNode('', '', '', 'Root 2');
o.addNode('', 'Root 2', 'r', 'using');
o.addNode('', 'Root 2', 'r', 'text as\nid');

o.drawChart('c_nodes');

</script>
  
  
</body>
</html>
