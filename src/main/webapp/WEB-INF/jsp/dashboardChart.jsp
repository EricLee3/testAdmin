<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Custom tabs (Charts with tabs)-->
<div class="nav-tabs-custom">
	<!-- Tabs within a box -->
	<ul class="nav nav-tabs pull-right">
		<li class="active"><a href="#revenue-chart" data-toggle="tab">Area</a></li>
		<li><a href="#sales-chart" data-toggle="tab">Donut</a></li>
		<li class="pull-left header"><i class="fa fa-inbox"></i> Sales</li>
	</ul>
	<div class="tab-content no-padding">
		<!-- Morris chart - Sales -->
		<div class="chart tab-pane active" id="revenue-chart"
			style="position: relative; height: 300px;"></div>
		<div class="chart tab-pane" id="sales-chart"
			style="position: relative; height: 300px;"></div>
	</div>
</div>
<!-- /.nav-tabs-custom -->