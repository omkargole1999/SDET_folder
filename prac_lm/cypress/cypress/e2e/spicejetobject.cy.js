import {spicejet_repo} from "D:\\Omkar Gole\\Cypress\\cypress\\e2e\\spicejetrepository.js"

describe("Spicejet signup repo" , ()=>{

 it("spice jet sign up" , () =>{
    cy.fixture("Signup") . then ((user) =>{


    cy.visit("https://spiceclub.spicejet.com/signup")
    const obj = new spicejet_repo();
   
   
    obj.selectTitle(user.title)
    obj.selectFirstName(user.first_name)
    obj.selectLastname(user.last_name)
    obj.selectCountry(user.country)
    obj.selectDOB(user.DOB)
    obj.selectmobile(user.mobile_no)
    obj.selectEmail(user.email)
    obj.selectPassword(user.password)
    obj.selectCPassword(user.password)
    obj.selectSubmit()
})
 })
})

