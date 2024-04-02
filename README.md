# User Management system 

## About

User management System, where administrators have the capability to perform CRUD (Create, Read, Update, Delete) operations on users. Users themselves can modify their basic information directly.

> This system have both back-end and front-end, current repo are **back-end**:
> 
> User Center - back-end (<- We are here)
> 
> [User Center - front-end](https://github.com/becoze/usercenter-frontend) (See front-end source code in this repo...)

## Tech Stack

### Backend
- Java
- Spring Boot
- SpringMVC
- Mybatis & Mybatis-plus (ORM: map OOP models to relational database models)
- log4j (log)
- MySQL
- JUnit (unit test)

### Frontend
- React
- HTML + CSS + JS
- Umi (React enhancement)
- Ant Design Pro (elements and components) 

###  Other
- IntelliJ IDEA & WebStrom
- Maven
- Mysql
- jdk1.8
- Markdown + Typora (document logging)


## Quick Start
### Environment (recommended)
- Java Version：1.8.0_371
- MySQL: 8.0.20
- Redis: 5.0.14
- Erlang: 24.2
- RabbitMQ: 3.9.11

### Front-end
1. Install `node_modules`:
    ```
    npm install 
    ```
   or
    ```
    yarn
    ```
2. Build
    ```
    npm start
    ```
3. Run
    ```
    npm run dev
    ```
4. Open `localhost:8000` in browser

### Back-end
1. Download/clone the project to your local machine.
2. Open the project in your IDE and wait for dependencies to be downloaded.
3. Modify the configuration file `application.yaml`. 
   1. Database 
   ```yml
    spring:
       datasource:
          driver-class-name: com.mysql.cj.jdbc.Driver
          url: jdbc:mysql://localhost:3306/[Your database]
          username: [root or your username]
          password: [your password]
    ```
   2. and Other for example: `application:`, etc.
4. Once the modifications are complete, run the project by executing the `UserCenterApplication` program.

## OverView 

System Design

![Structure](https://raw.githubusercontent.com/becoze/becozePictureHosting/main/usercenter/readmeImage/stracture.png)

User Registration
![register](https://raw.githubusercontent.com/becoze/becozePictureHosting/main/usercenter/readmeImage/register.png)

Login
![login](https://raw.githubusercontent.com/becoze/becozePictureHosting/main/usercenter/readmeImage/login.png)

Home Page
![welcome](https://raw.githubusercontent.com/becoze/becozePictureHosting/main/usercenter/readmeImage/welcome.png)

User Profile
![profile](https://raw.githubusercontent.com/becoze/becozePictureHosting/main/usercenter/readmeImage/user_profile.png)

User modifies their own information
![userModify](https://raw.githubusercontent.com/becoze/becozePictureHosting/main/usercenter/readmeImage/user_profile_modifly.png)

User changes their password
![userChange](https://raw.githubusercontent.com/becoze/becozePictureHosting/main/usercenter/readmeImage/user_profile_password.png)

Administrator User Management
![admin](https://raw.githubusercontent.com/becoze/becozePictureHosting/main/usercenter/readmeImage/user_management.png)

Administrator modifies other user's information
![adminModifly](https://raw.githubusercontent.com/becoze/becozePictureHosting/main/usercenter/readmeImage/user_management_modifly.png)

Administrator delete user
![adminDelete](https://raw.githubusercontent.com/becoze/becozePictureHosting/main/usercenter/readmeImage/user_management_delete.png)

Administrator add new user
![add1](https://raw.githubusercontent.com/becoze/becozePictureHosting/main/usercenter/readmeImage/add_user_1.png)

![add2](https://raw.githubusercontent.com/becoze/becozePictureHosting/main/usercenter/readmeImage/add_user_2.png)

## Contributing
Contributions are always welcome. GitHub has great instructions on how to set up Git, fork a project and make pull requests.

## Contact Me
If you have questions or wish to discuss the project further, welcome to reach out!

More contact details > [My profile - becoze](https://github.com/becoze).
