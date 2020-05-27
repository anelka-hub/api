<%--
  Created by IntelliJ IDEA.
  User: Ish
  Date: 20/5/2020
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <title >Student's portal</title>
</head>

<body>

    <div class="container col-4">

        <h1 style="text-align: center;" class="mt-5 mb-5 h1">Students Details</h1>

        <form action="/webapp_war_exploded/add" method="post">

            <div class="form-group >
                <label class="" for="student_id"> Student ID: </label>
                <input class="form-control" type="number" name="student_id" id="student_id" width="4" />
            </div>
            <div class="form-group ">
                <label class="" for="first_name">First Name: </label>
                <input class="form-control" type="text" name="first_name" id="first_name" width="30" />
            </div>
            <div class="form-group ">
                <label class="" for="surname">Surname: </label>
                <input class="form-control" type="text" name="surname" id="surname" width="35" />
            </div>
            <div class="form-group">
                <label class="input-label" for="date_of_birth">Date Of Birth: </label>
                <input class="form-control" type="date" name="date_of_birth" id="date_of_birth" />
            </div>

            <div class="form-group">
                <div style="text-align: center;" class="row">
                <input type="submit" class="form-control col-12 ml-3 btn btn-success" value="Add Student" />
            </div>
        </form>
    </div>

    <div class="container col-12">
        <form action="/webapp_war_exploded/list" method="post">
            <div class="form-group">
                <div style="text-align: left;" class="row">
                    <input type="submit" class="form-control col-12 ml-3 btn btn-success" value="Display Details"/>
                </div>
        </form>
    </div>

</body>
<script src="./js/bootstrap.min.js"></script>
</html>