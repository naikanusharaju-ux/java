<html>
<head>
    <title>Student Marks Entry</title>

    <script>
        function validateForm() {

            let roll = document.forms["stuForm"]["rollno"].value;
            let name = document.forms["stuForm"]["name"].value;

            let s1 = document.forms["stuForm"]["sub1"].value;
            let s2 = document.forms["stuForm"]["sub2"].value;
            let s3 = document.forms["stuForm"]["sub3"].value;
            let s4 = document.forms["stuForm"]["sub4"].value;
            let s5 = document.forms["stuForm"]["sub5"].value;

            if (roll == "" || name == "") {
                alert("Roll No and Name required!");
                return false;
            }

            if (s1 == "" || s2 == "" || s3 == "" || s4 == "" || s5 == "") {
                alert("All subject marks are required!");
                return false;
            }

            return true;
        }
    </script>

</head>
<body>

<h2>Student Result Form</h2>

<form name="stuForm" action="ResultServlet" method="post" onsubmit="return validateForm()">

    Roll No: <input type="text" name="rollno"><br><br>

    Name: <input type="text" name="name"><br><br>

    Sub1: <input type="number" name="sub1"><br><br>
    Sub2: <input type="number" name="sub2"><br><br>
    Sub3: <input type="number" name="sub3"><br><br>
    Sub4: <input type="number" name="sub4"><br><br>
    Sub5: <input type="number" name="sub5"><br><br>

    <input type="submit" value="Submit">

</form>

</body>
</html>