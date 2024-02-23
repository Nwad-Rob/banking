<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <link rel="stylesheet" href="../src/main.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <title>Dashboard</title>
</head>
<body>

    <!-- Main Page Header-->
    <header class="main-page-header mb-3 bg-secondary ">
        <!--Container-->
        <div class="container d-flex align-items-center">
            <!--Company Name-->
            <div class="company-name">
                Dynamic Banking
                </div>
                <!--Navigation-->
                <nav class="navigation">
                    <li><a href=""> Dashboard </a></li>
                    <li><a href=""> Payment History </a></li>
                    <li><a href=""> Transaction History </a></li>
                </nav>

                <!--Display Name-->
                <div class="display-name ms-auto text-white">
                   <i class="fa fa-circle text-success me-2 "></i> WELCOME: <span> UserName </span>
                </div>

                <!-- Log Out Button-->
                <a href="" class="btn btn-sm ms-2 text-white">
                    <i class="fa fa-sign-out me-2"></i>Sign Out
                </a>
            </div>
        </div>

    </header>
    <!--Main page Header ends-->

          <!--Start of offcanvas body-->
          <div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasExample"aria-label ="offcanvasExampleLablel">
            <div class="offcanvas-header">
                <h5 class="offcanvas-title text-black" id ="offcanvasExampleLabel">Transaction</h5>
                <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                </div>

                <!--OffCanvas: transaction body-->
                <div class="offcanvas-body">
                    <small class="card-text  text-black">
                        Choose an Option below to perform a transaction
                    </small>
                   <!--Transaction type: Drop down list-->
                    <select name="transact-type" class="form-control my-3" id="transact-type">
                        <option value="">-- Select Transaction type --</option>
                        <option value="payment">-- Payment --</option>
                        <option value="transfer">-- Transfer --</option>
                        <option value="deposit">-- Deposit --</option>
                        <option value="withdraw">-- Withdraw --</option>
                    </select>
                   <!--End of Transaction type: Drop down list-->

                   <!--Card: Payment-->
                   <div class="card payment-card">
                    <!--Card Body-->
                    <div class="card-body">
                        <!--form Groups-->
                        <div class="form-group mb-2">
                            <label for=""> Account Holder/Beneficiery</label>
                            <input type="text" class="form-control"   name="account_number"Placeholder=" Enter Account Holder / Beneficiery's Name">
                        </div>
                        <!--Second Form Group-->
                        <div class="form-group">
                            <label for=""> Beneficiery Account Number</label>
                            <input type="text" class="form-control"   name="account_number"Placeholder=" Beneficiery's Account No">
                        </div>

                       <!--Form Group-->
                       <div class="form-group">
                        <label for=""> Select Account</label>
                             <!-- Select Account Option-->
                        <select name="account_id" class="form-control " id="">
                            <option value="">-- Select Account --</option>
                        </select>
                       </div>

                       <div class="form-group">
                        <label for=""> Reference</label>
                        <input type="text" class="form-control"   name="reference"Placeholder=" Enter Reference">
                    </div>
                    <!--Another Form Group-->
                    <div class="form-group">
                        <label for="">Enter Payment Amount</label>
                        <input type="text" class="form-control"   name="payment_amount" Placeholder=" Enter Payment Amount">
                    </div>

                    <div class="form-group">
                        <button id="transact-btn" class="btn btn-md"> Pay </button>
                    </div>


                    </div>
                    <!--End of Card Body-->
                   </div>
                   <!-- End of Card Payment-->
                   
 <!--Card: transfer-->
 <div class="card transfer-card">
  <!--Card Body-->
  <div class="card-body">
    

     <!--Form Group-->
     <div class="form-group">
      <label for=""> Select Account</label>
           <!-- Select Account Option-->
      <select name="account_id" class="form-control " id="">
          <option value="">-- Select Account --</option>
      </select>
     </div>

      <!--Form Group-->
      <div class="form-group">
        <label for=""> Select Account</label>
             <!-- Select Account Option-->
        <select name="account_id" class="form-control " id="">
            <option value="">-- Select Account --</option>
        </select>
       </div>

  <!--Another Form Group-->
  <div class="form-group">
      <label for="">Enter transfer Amount</label>
      <input type="text" class="form-control"   name="transfer_amount" Placeholder=" Enter transfer Amount">
  </div>

  <div class="form-group">
      <button id="transact-btn" class="btn btn-md"> Transfer </button>
  </div>


  </div>
  <!--End of Card Body-->
 </div>
 <!-- End of Card transfer-->

 <!--Card: deposit-->
 <div class="card deposit-card">
  <!--Card Body-->
  <div class="card-body">
    <div class="form-group">
      <label for="">Enter deposit Amount</label>
      <input type="text" class="form-control"   name="deposit_amount" Placeholder=" Enter Deposit Amount">
  </div>
  <form action="" class="depost-form">
    <!--Form Group-->
    <div class="form-group">
      <label for=""> Select Account</label>
           <!-- Select Account Option-->
      <select name="account_id" class="form-control " id="">
          <option value="">-- Select Account --</option>
      </select>
     </div>

<div class="form-group ">
    <button id="transact-btn" class="btn btn-md"> Deposit </button>
</div>


  </form>
 
  <!--End of the Deposit form-->
  </div>
  <!--End of Card Body-->
 </div>
 <!-- End of Card deposit-->

 <!--Card: withdraw-->
 <div class="card withdraw-card">
  <!--Card Body-->
  <div class="card-body">
    <div class="form-group">
      <label for="">Enter Withdrawal Amount</label>
      <input type="text" class="form-control"   name="withdraw_amount" Placeholder=" Enter Withdrawal Amount">
  </div>
  <form action="" class="depost-form">
    <!--Form Group-->
    <div class="form-group">
      <label for=""> Select Account</label>
           <!-- Select Account Option-->
      <select name="account_id" class="form-control " id="">
          <option value="">-- Select Account --</option>
      </select>
     </div>

<div class="form-group ">
    <button id="transact-btn" class="btn btn-md"> Withdraw </button>
</div>


  </form>
 
  <!--End of the withdraw form-->
  </div>
  <!--End of Card Body-->
 </div>
 <!-- End of Card withdraw-->
                </div>
                <!--End of offCanvas Body-->
                
            </div>
            <!--End of Transaction body-->
            <!--Right Side Offcanvas: Accounts Form Container-->
            <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasRight" aria-labelledby="offcanvasRightlabel">
                <div class="offcanvas-header">
                <h5 id="offCanvasRightlabel" class="text-black"> Create / Add an Account</h5>
                <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                 </div>
            <!-- Offcanvas Body: Accounts form wrapper-->
                 <div class="offcanvas-body">
                       <!-- Card: Account form Card-->
                        <div class="card">
                          <!-- Card Body-->
                          <div class="card-body">
                            <form action="" class="add-account-form">
                              <!--Form Group-->
                              <div class="form-group mb-3">
                                <label for=""> Enter Account Name </label>
                                <input type="text" name="account_name" class="form-control" placeholder="Enter Account name">
                              </div>

                                <!--Form Group-->
                                <div class="form-group mb-3">
                                  <label for=""> Enter Account Name </label>
                                 <select name="account_type" class="form-control" id="">
                                  <option value=""> --Select Account Type--</option>
                                  <option value="check"> --Checking Account--</option>
                                  <option value="savings"> --Savings Account Type</option>
                                  <option value="business"> --Business Account Type</option>
                                 </select>
                                </div>

                                <!--Form Group-->
                                <div class="form-group mb-2 ">
                                  <button id="transact-btn" class="btn btn-md"> Add Account </button>
                              </div>
                            </form>
                          </div>
                        </div>
                       <!--End of Card: Account form Card-->
                    </div>
             <!-- End of Offcanvas Body: Accounts form wrapper-->
             </div>
        <!--End of Right Side OffCanvas-->

    <!--Container-->
    <div class="container d-flex">
        <!--Default Off Canvas-->

        <button id = "account-btn" class = "btn btn-lg shadow" type="button" data-bs-target="#offcanvasRight" data-bs-toggle="offcanvas" aria-controls="offcanvasRight">
             <i class="fa fa-credit-card"></i> Add New Account</button>
            <!--Transaction Button-->
        <button id="transact-btn" class="btn ms-auto btn-lg shadow"  type="button" data-bs-toggle="offcanvas" data-bs-target = "#offcanvasExample" aria-controls="#offcanvasExample">
           <i class="fa fa-wallet>"></i> Transaction
        </button>
      
    </div>
    <!--End of Container-->
        <!--Back Drop offcanvas: Light Background-->

    <!--- Container: Total Account Balance Dsp-->
    <div class="container d-flex py-3">
        <h2 class="me-auto"> Total Account Balance</h2>
        <h2 class="ms-auto"> 0.00</h2>
    </div>
     <!--- End of Container: Total Account Balance Dsp-->

    <!--Container: Accordia Menu/ Drop Down-->
    <div class="container">
        <div class="accordion accordion-flush" id="accordionFlushExample">
            <div class="accordion-item">
              <h2 class="accordion-header">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
                  Accordion Item #1
                </button>
              </h2>
              <div id="flush-collapseOne" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the first item's accordion body.</div>
              </div>
            </div>
            <div class="accordion-item">
              <h2 class="accordion-header">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
                  Accordion Item #2
                </button>
              </h2>
              <div id="flush-collapseTwo" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the second item's accordion body. Let's imagine this being filled with some actual content.</div>
              </div>
            </div>
            <div class="accordion-item">
              <h2 class="accordion-header">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseThree" aria-expanded="false" aria-controls="flush-collapseThree">
                  Accordion Item #3
                </button>
              </h2>
              <div id="flush-collapseThree" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
                <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the third item's accordion body. Nothing more exciting happening here in terms of content, but just filling up the space to make it look, at least at first glance, a bit more representative of how this would look in a real-world application.</div>
              </div>
            </div>
          </div>
<!-- End of Accordian Drop down-->
    </div>
<!-- End of Container:  Accordian Drop down-->

<!--Container: No Accounts-->
<div class="container">
    <!--Card: # Accounts-->
    <div class="card no-account-card">
        <!--Card Body-->
        <div class="card-body">
            <h1 class="card-title">
                <i class="fas fa-ban text-danger"></i>NO Registered Accounts
            </h1>
        <!--End of Card Body-->
        <!-- Card Text-->
        <hr>
        <div class="card-text">
            You  do not have any registered accounts.<br>
            Please click below to register/add a new account.
        </div>
        <br>
        <!--End of Card text-->
        <button  class = "btn btn-secondary btn-lg shadow" type="button" data-bs-target="#offcanvasRight" data-bs-toggle="offcanvas" aria-controls="offcanvasRight">
            <i class="fa fa-credit-card"></i> Add New Account</button>
        </div>
    </div>
     <!--End of Card: # Accounts-->
</div>
<!--Container: No Accounts-->

<script src="main.js"></script>


    
</body>
</html>