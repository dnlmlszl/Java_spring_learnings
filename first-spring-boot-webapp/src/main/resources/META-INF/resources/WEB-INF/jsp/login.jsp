<html>
	<head>
		<title>Login Page</title>
	</head>
	<body style="font-family: Arial, sans-serif; background-color: #f9f9f9; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0;">
        <div style="background-color: white; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); width: 100%; max-width: 400px;">
            
            <h1 style="margin-top: 0; text-align: center;">Login</h1>
            <!--<h3 style="text-align: center;">Hello there, ${name}!</h3>
            
            <form>
            	Name: <input type="text" name="name"> 
            	Password: <input type="password" name="password"> 
            	<input type="submit">
            </form>
            
            -->
            
            <form action="/login" method="post" style="display: flex; flex-direction: column; align-items: center;">
                <label for="username" style="margin-bottom: 8px;">Username:</label>
                <input type="text" id="username" name="username" required style="padding: 8px; margin-bottom: 16px; border: 1px solid #ccc; border-radius: 4px; width: 100%;">
                <label for="password" style="margin-bottom: 8px;">Password:</label>
                <input type="password" id="password" name="password" required style="padding: 8px; margin-bottom: 16px; border: 1px solid #ccc; border-radius: 4px; width: 100%;">
                <input type="submit" value="Login" style="padding: 10px 20px; background-color: #007BFF; color: white; border: none; border-radius: 4px; cursor: pointer;">
            
            </form>
            <pre style="color: red; text-align: center;">${errorMessage}</pre>
        </div>
    </body>
</html>