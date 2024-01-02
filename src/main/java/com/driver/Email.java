package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(this.password.equals(oldPassword))
        {
            boolean flag1 = false;
            if(newPassword.length() >=8)
            {
                flag1 = true;
            }
            boolean flag2 = false;
            for(int i=0;i<newPassword.length();i++)
            {
                if(newPassword.charAt(i)>='A' && newPassword.charAt(i)<='Z')
                {
                    flag2 = true;
                    break;

                }
            }
            boolean flag3 = false;
            for(int i=0;i<newPassword.length();i++)
            {
                if(newPassword.charAt(i)>='a' && newPassword.charAt(i)<='z')
                {
                    flag3 = true;
                    break;

                }
            }
            boolean flag4 = false;
            for(int i=0;i<newPassword.length();i++)
            {
                if(newPassword.charAt(i)>='0' && newPassword.charAt(i)<='9')
                {
                    flag4 = true;
                    break;

                }
            }
            boolean flag5 = false;
            for(int i=0;i<newPassword.length();i++)
            {
                if (!Character.isDigit(newPassword.charAt(i))
                        && !Character.isLetter(newPassword.charAt(i))
                        && !Character.isWhitespace(newPassword.charAt(i)))
                {
                    flag5 = true;
                    break;

                }
            }

            if(flag1 && flag2 && flag3 && flag4 && flag5)
            {
                setPassword(newPassword);
            }

        }

    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setEmailId(String email)
    {
        this.emailId = email;
    }
}