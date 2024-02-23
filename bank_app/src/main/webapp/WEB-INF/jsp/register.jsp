<%@ taglib url= "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix= "form" uri=http://www.springframework.org/tags/form" %>
<%@ taglib prefix= "fn" uri= "http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
      crossorigin="anonymous"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <link rel="stylesheet" href="../src/index.css" />
    <title>Register</title>
  </head>
  <body class="d-flex align-items-center justify-content-center">
    <!--Card Registration-->
    <div class="card registration-form-card col-6 bg-transparent border-0">
      <!--CardBody-->
      <div class="card-body">
        <!--Form Header-->
        <h1 class="form-header card-title mb-3">
          <i class="fa fa-edit"></i>Register
        </h1>
        <!--End of Form Header-->
        <!--Registration Form-->
        <form:form action="/register" class="reg-form" modelAttribute="registerUser" >
          <!--Form Row-->
          <div class="row">
            <div class="form-group col">
              <form: input
                type="text"
                path="first_name"
                class="form-control-lg"
                placeholder="Enter First Name"
              />
              <form: errors path="first_name" class="text-white bg-danger"/>
            </div>

            <div class="form-group col">
              <form: input
                type="text"
                path="last_name"
                class="form-control-lg"
                placeholder="Enter Last Name"
              />
              <form: errors path="last_name" class="text-white bg-danger"/>
            </div>
          </div>

          <div class="form-group col ">
            <form: input
              type="email"
              path="email"
              class="form-control-lg"
              placeholder="Enter Email"
            />
            <form: errors path="email" class="text-white bg-danger"/>
          </div>

          <div class="row">
            <div class="form-group col">
              <form: input
                type="password"
                path="password"
                class="form-control-lg"
                placeholder="Enter Password"
              />
              <form: errors path="password" class="text-white bg-danger"/>
            </div>

            <div class="form-group col">
              <input
                type="password"
                name="confirm_password"
                class="form-control-lg"
                placeholder="Confirm Password"
              />
              <small class="text-white bg-danger">${confirm_pass}</small>
            </div>
          </div>

          <div class="form-group col">
            <button class="btn btn-lg">Register</button>
          </div>
          <!--End of Row-->
        </form:form>

        <p class="card-text text-white my-2">
          Already have an account?<span class="ms-2 "><a href="/login" class="btn bt-sm  text-warning"> Sign In</a>
            </span
          >
        </p>

        <!-- Back Button to Landing page-->
        <small class="text-warning">
          <i class="fa fa-arrow-alt-circle-left me-1"></i
          ><a href="/index" class="btn btn-sm text-warning"> Back</a>
        </small>
        <!-- End of back Button to Landing page-->
      </div>
    </div>
  </body>
</html>
