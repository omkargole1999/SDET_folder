class spicejet_repo
{
    

    selectTitle(title)
    {
        cy.get('.col-sm-4 > .form-control').select(title)
    }
    selectFirstName(firstname)
    {
        cy.get('#first_name').click().type(firstname)
    }
    selectLastname(lastname)
    {
        cy.get('#last_name').type(lastname)
    }
    selectCountry(country)
    {
        cy.get(':nth-child(3) > :nth-child(1) > .form-control').select(country)
    }
    selectDOB(dob)
    {
         cy.get('#dobDate').click().type(dob)
    }
    selectmobile(mobile)
    {
        cy.get('.react-tel-input > .form-control').type(mobile)
    }
    selectPassword(password)
    {
        cy.get('#new-password').click().type(password)
    }
    selectCPassword(password)
    {
        cy.get('#c-password').click().type(password)
    }
    selectEmail(Email)
    {
        cy.get('#email_id').click().type(Email)
    }

    selectSubmit()
    {
        cy.get('#defaultCheck1').check();
        cy.get('.px-sm-4 > a > .btn').click()
    }
}

export {spicejet_repo}