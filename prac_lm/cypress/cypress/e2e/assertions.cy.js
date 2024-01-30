

describe(" assertions", () =>{
   
    //   it("Implecit Assertions",() =>{
    //       cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    //     //   cy.title().should("eq" , "OrangeHRM")
    //     //   cy.url().should("include","orange")
    //       //cy.url().should("contain" , "blue")
    //       cy.get("input[name=username]").type("Admin")
    //       cy.get("input[name=password]").type("admin123")
    //       cy.get("button[type=submit").click()

    //       cy.url().should("contain" , "orange")
    //       .and("include","orange")


    //   })

    it("Explicit Assertions",() =>{
               cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
              
              cy.get("input[name=username]").type("Admin")
              cy.get("input[name=password]").type("admin123")
              cy.get("button[type=submit").click()
    
              let expname = "omkar"
              cy.get('.oxd-userdropdown-name').then((x) =>{
                let acname = x.text()
                expect(acname).to.not.equal(expname)
                expect(acname).to.equal("Burak İkinci")

            assert.equal(acname , expname)
            assert.notEqual(acname , expname)

              })
    })
    
   
})