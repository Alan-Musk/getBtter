import os
import smtplib
from flask import Flask,render_template,request

#装配app
app=Flask(__name__)


@app.route("/")
def index():
    return render_template("index.html")

@app.route("/register",methods=["POST"])
def register():
    name=request.form.get("name")
    email=request.form.get("email")
    dorm=request.form.get("dorm")
    if not name or not dorm or not email:
        return render_template("failure.html")
    message="You are registered!"
    server=smtplib.SMTP("smtp.gmail.com",25)
    # starttls()加密
    server.starttls()
    server.login("alanmuskccoder@gmail.com",os.getenv("Fanzf12345"))
    server.sendmail("alanmuskccoder@gmail.com",email,message)
    return render_template("success.html")