describe('Web Table ', ()=>{
    
    it("Check the no.of rows and columns",function(){
       
        cy.visit("https://www.dezlearn.com/webtable-example/")
        cy.get("#post-9373 > div > div > section > div > div > div > section > div > div > div > div > div > table > tbody > tr").should("have.length",7)
        cy.get("#post-9373 > div > div > section > div > div > div > section > div > div > div > div > div > table > tbody > tr >th").should("have.length",6)
        cy.get('tbody > :nth-child(2) > :nth-child(1)').contains("Tim Watson")
        
        cy.get("#post-9373 > div > div > section > div > div > div > section > div > div > div > div > div > table > tbody > tr")
        .each(($row, index, $rows)=>{
            cy.wrap($row).within(()=>{
        cy.get("th").each(($col, index, $cols)=>{
            cy.log($col.text())
            })
        
        })
        })
        })
        })
    