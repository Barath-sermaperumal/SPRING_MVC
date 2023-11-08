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
    <section class="d-flex justify-content-center h-100 w-50">
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
                <form class="col-xl-6" method="get" action="home">
                  <div class="card-body p-md-5 text-black">
                    <h3 class="mb-5 text-uppercase">
                      Student Login form
                    </h3>

                    <div class="row">
                      <div class="col mb-4">
                        <div class="form-outline">
                          <input
                            type="email"
                            id="uname"
                            class="form-control form-control-lg"
                            placeholder="Enter your email"
                            name="uname"
                          />
                        </div>
                      </div>
                    </div>

                    <div class="form-outline mb-4">
                      <input
                        type="password"
                        id="upassword"
                        class="form-control form-control-lg"
                        placeholder="Enter password"
                        name="upassword"
                      />
                    </div>

                      <%
                      if(request.getAttribute("error")!=null){
                      out.print("<p>Invalid!</p>");
                      }
                      %>

                    <div class="d-flex justify-content-start pt-3">
                      <a href="home"><input class="btn btn-warning" type="submit" value="login"></a>
                    </div>
                    Already a user?<a href="register">Sign In</a>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  </body>
</html>
