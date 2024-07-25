<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>	

    <div class="container mt-5">
	    <div class="card">
	    	<div class="card-title bg-primary p-3">
	    		<h3 class="text-white">Enter Todo Details</h3>
	    	</div>
	    	<form:form method="post" modelAttribute="todo">
	    		<fieldset class="mb-3 p-3">
	    		
                    <form:label path="description" cssClass="form-label">Description</form:label>
                    <form:input type="text" cssClass="form-control" path="description" required="required" />
                    <div class="mt-3">
                    	<form:errors path="description" cssClass="text-warning" />
                    </div>                    
                    
                </fieldset>
                

				<fieldset class="mb-3 p-3">	
							
					<form:label path="targetDate" cssClass="form-label">Target Date</form:label>
					<form:input type="text" cssClass="form-control" path="targetDate" required="required"/>
					<div class="mt-3">
                    	<form:errors path="targetDate" cssClass="text-warning" />
                    </div>  
					
				</fieldset>

	    		
	    		<input type="submit" value="Submit" class="btn btn-outline-primary mx-3" />
	    	</form:form>
	    </div>
    </div>
    
<%@ include file="common/footer.jspf" %>

<script type="text/javascript">
	$('#targetDate').datepicker({
	   format: 'yyyy-mm-dd'
	});
</script>