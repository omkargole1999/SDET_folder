describe("Mouse operations " ,() =>{
      it.skip("Mouseover" , () =>{
           cy.visit("https://demo.opencart.com/")
         cy.get('.nav > :nth-child(1) > .dropdown-toggle').trigger("mouseover").click()
         cy.get(':nth-child(1) > .dropdown-menu > .dropdown-inner > .list-unstyled > :nth-child(2) > .nav-link').should("be.visible").click()

      })
     it.skip("Right click" , () =>{
          cy.visit("https://swisnl.github.io/jQuery-contextMenu/")
          cy.get('.wy-menu > :nth-child(1) > :nth-child(3) > :nth-child(1)').click()
          cy.get('.context-menu-one').trigger("contextmenu")
          cy.wait(6000)
          cy.get('.context-menu-icon-edit').click()
})
 it.only("Double click" , () =>{
        cy.visit("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php")
        cy.get('input').should("be.visible").click()
        cy.wait(4000)
        cy.get('input').dblclick()


 })

})