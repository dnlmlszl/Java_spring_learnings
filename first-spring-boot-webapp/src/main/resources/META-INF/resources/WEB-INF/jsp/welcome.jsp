<html>
    <head>
        <title>Welcome</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f9f9f9;
                margin: 0;
                padding: 0;
            }
            .header {
                background-color: #007BFF;
                color: white;
                padding: 10px 0;
                text-align: center;
            }
            .container {
                padding: 20px;
                text-align: center;
            }
            .login-container {
            	display: flex;
            	align-items: center;
            	justify-content: center;
            	gap: 2rem;
            }
            .button {
                padding: 10px 20px;
                background-color: #007BFF;
                color: white;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                text-decoration: none;
                display: inline-block;
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <div class="header">
            <h1>Welcome Page</h1>
        </div>
        <div class="container">
            <h2>Welcome, ${username}!</h2>
            
            <p>You have successfully logged in.</p>
            <div class="login-container">
            	<a href="/login" class="button">Login</a>
            	<a href="/list-todos" class="button">Manage your todos</a>
            </div>
        </div>
    </body>
</html>
