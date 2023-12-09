/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barash_serbest_5220505051;

import javax.swing.JButton;
/**
 *
 * @author const
 */
public class GraphQLButton extends JButton {

    private String graphqlEndpoint;
    private String graphqlInfo;

    public GraphQLButton(String text) {
        super(text);
    }

    public String getGraphqlEndpoint() {
        return graphqlEndpoint;
    }

    public void setGraphqlEndpoint(String graphqlEndpoint) {
        this.graphqlEndpoint = graphqlEndpoint;
    }

    public String getGraphqlInfo() {
        return graphqlInfo;
    }

    public void setGraphqlInfo(String graphqlInfo) {
        this.graphqlInfo = graphqlInfo;
    }

    public void performGraphqlRequest() {        
        // graphqlEndpoint ve graphqlInfo kullanarak istek oluşturuluyor.
        System.out.println("GraphQL Endpoint: " + graphqlEndpoint);
        System.out.println("GraphQL Info: " + graphqlInfo);
        // GraphQL isteği burada gerçekleştirilecek.
    }
}
