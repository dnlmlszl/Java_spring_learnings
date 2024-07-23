<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <title>Add Todo Page</title>
        
         <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
         <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
         
         <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            margin-top: 50px;
        }
        .form-label {
            font-weight: bold;
        }
        .form-control {
            border-radius: 5px;
        }
        .btn-outline-primary {
            margin-top: 10px;
        }
        .card {
            border: none;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 20px;
            background-color: white;
        }
    </style>
    
    </head>
    <body>
    <div class="container mt-5">
	    <div class="card">
	    	<h3 class="card-title">Enter Todo Details</h3>
	    	<form:form method="post" modelAttribute="todo">
	    		<fieldset class="mb-3">
	    		
                    <form:label path="description" cssClass="form-label">Description</form:label>
                    <form:input type="text" cssClass="form-control" path="description" required="required" />
                    <div class="mt-3">
                    	<form:errors path="description" cssClass="text-warning" />
                    </div>                    
                    
                </fieldset>
                

				<fieldset class="mb-3">	
							
					<form:label path="targetDate" cssClass="form-label">Target Date</form:label>
					<form:input type="text" cssClass="form-control" path="targetDate" required="required"/>
					<div class="mt-3">
                    	<form:errors path="targetDate" cssClass="text-warning" />
                    </div>  
					
				</fieldset>

	    		
	    		<input type="submit" value="Submit" class="btn btn-outline-primary" />
	    	</form:form>
	    </div>
    </div>
    
    	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
		<script type="text/javascript">
			$('#targetDate').datepicker({
			    format: 'yyyy-mm-dd'
			});
		</script>
		
    </body>
</html>