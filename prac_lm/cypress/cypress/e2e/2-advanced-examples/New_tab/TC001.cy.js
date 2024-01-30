describe('Example to demonstrate the handling of new browser windows in cypress', () => {

    it.only("href attribute", ()=>{

        cy.visit("https://www.asianpaints.com/online-shop/colour-selection-tools.html")
        cy.wait(3000)
        cy.get('[href="https://www.asianpaints.com/online-shop/colour-selection-tools/woodtech-spectra-1600.html"] > p').invoke('removeAttr' , 'target').then((newtab)=>{
             const hreftab=newtab.prop('href')
            cy.log(hreftab)
            let length1=hreftab.length()
             let newtb=hreftab.substring(6,length1-6)
                        cy.visit(newtb)
cy.log(newtb)
            cy.url().should("eq","https://www.asianpaints.com/online-shop/colour-selection-tools/woodtech-spectra-1600.html")
        })
        
            })

})