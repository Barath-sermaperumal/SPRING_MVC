<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <head>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
      crossorigin="anonymous"
      defer
    ></script>
    <style>
      .card-registration .select-input.form-control[readonly]:not([disabled]) {
        font-size: 1rem;
        line-height: 2.15;
        padding-left: 0.75em;
        padding-right: 0.75em;
      }
      .card-registration .select-arrow {
        top: 13px;
      }
    </style>
  </head>
  <body class="d-flex justify-content-center">
    <section class="h-100 w-50">
      <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col">
            <div class="card card-registration my-4">
              <div class="row g-0">
                <div class="col-xl-6 d-none d-xl-block">
                  <img
                    src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp"
                    alt="Sample photo"
                    class="img-fluid"
                    style="
                      border-top-left-radius: 0.25rem;
                      border-bottom-left-radius: 0.25rem;
                    "
                  />
                </div>
                <form:form class="col-xl-6" action="register" method="post" modelAttribute="user">
                  <div class="card-body p-md-5 text-black">
                    <h3 class="mb-5 text-uppercase">
                      Welcome to Registration
                    </h3>

             <div class="row">
                      <div class="col mb-4">
                        <div class="form-outline">
                          <form:input
                            path="name"
                            class="form-control form-control-lg"
                            placeholder="Enter your Name"
                          />
                        </div>
                      </div>
                    </div>

                    <div class="form-outline mb-4">
                       <form:input
                        type="text"
                        id="email"
                        path="email"
                        class="form-control form-control-lg"
                        placeholder="Enter your email"
                      />
                    </div>

                    <div
                      class="d-md-flex justify-content-start align-items-center mb-4 py-2" name=""
                    >
                      <h6 class="mb-0 me-4">Gender:</h6>

                      <div class="form-check form-check-inline mb-0 me-4">
                        <form:radiobutton
                          path="gender"
                          id="femaleGender"
                          value="Female"
                        />
                        <label class="form-check-label" for="Female"
                          >Female</label
                        >
                      </div>

                      <div class="form-check form-check-inline mb-0 me-4">
                        <form:radiobutton
                          path="gender"
                          id="maleGender"
                          value="Male"
                        />
                        <label class="form-check-label" for="Male"
                          >Male</label
                        >
                      </div>

                      <div class="form-check form-check-inline mb-0">
                        <form:radiobutton
                          path="gender"
                          id="otherGender"
                          value="Other"
                        />
                        <label class="form-check-label" for="Other"
                          >Other</label
                        >
                      </div>
                    </div>

                    <div class="row">
                      <h6 class="col-md-3">Languages:</h6>
                      <div class="col-md-3 form-check mb-4">
                        <form:checkbox
                          value="English"
                          path="languages"
                          id="English"
                        />
                        <label class="form-check-label" for="English">
                          English
                        </label>
                      </div>
                      <div class="col-md-3 form-check mb-3">
                        <form:checkbox
                          value="Tamil"
                          path="languages"
                          id="Tamil"
                        />

                        <label class="form-check-label" for="Tamil">
                          Tamil
                        </label>
                      </div>
                      <div class="col-md-3 form-check mb-3">
                        <form:checkbox
                          value="Hindi"
                          path="languages"
                          id="Hindi"
                        />
                        <label class="form-check-label" for="Hindi">
                          Hindi
                        </label>
                      </div>
                    </div>

                    <div class="row">
                      <div class="col-md-6 mb-4">
                        <form:select class="select form-control-lg form-control" path="country">
                          <form:option value="--select country--"/>
                          <form:option value="India" label="India"/>
                          <form:option value="China" label="China"/>
                          <form:option value="USA" label="USA"/>
                        </form:select>
                      </div>
                      <div class="col-md-6 mb-4">
                        <form:select class="select form-control-lg form-control" path="state" >
                          <form:option value="--select state--"/>
                          <form:option value="Tamilnadu"/>
                          <form:option value="Kerala"/>
                          <form:option value="Andhra Pradesh"/>
                        </form:select>
                      </div>
                    </div>

                    <div class="row">
                      <div class="col-md-6 mb-3">
                        <div class="form-outline">
                          <form:input
                            type="password"
                            id="form3Example1m1"
                            path="password"
                            class="form-control form-control-lg"
                            placeholder="Enter password"
                          />
                        </div>
                      </div>
                      <div class="col-md-6 mb-4">
                        <div class="form-outline">
                          <form:input
                            type="password"
                            id="form3Example1n1"
                            path="c_password"
                            class="form-control form-control-lg"
                            placeholder="Confirm password"
                          />
                        </div>
                      </div>
                    </div>

                    <div class="d-flex justify-content-start pt-3">
                      <a href="home"><input type="submit" class="btn btn-warning btn-lg ms-2" value="Register"></a>
                    </div>
                    Already a user?<a href="/">Sign Up</a>
                  </div>
                </form:form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  </body>
</html>
