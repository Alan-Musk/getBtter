from flask import Flask,render_template,request

from cs50 import SQL

app=Flask(__name__)

db=SQL("sqlite:///froshims1.db")

@app.route("/")
def index():
    q=request.args.get("q")
    rows=db.execute(f"SELECT * FROM registrants WHERE :name",name=q)
    return render_template("index.html",rows=rows)