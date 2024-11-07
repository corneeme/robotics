DcMotor leftfront;

motor = hardwareMap(dc.class,"leftfront");

//binds leftfront
  if (gamepad1.a){
    leftfront.setPower(-1);
  } else {
    leftfront.setPower(0);
  }

//bind to joystick 

double LFpower;
LFpower = gamepad1.right_stick_y;

leftfront.setPower(LFpower);











































