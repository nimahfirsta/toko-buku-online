/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  NFCS
 * Created: Feb 3, 2021
 */

CREATE TABLE ARTICLES (
    ARTICLE_ID int NOT NULL,
    CATEGORY_ID int NOT NULL,
    TITLE CHAR(100) NOT NULL,
    DESCRIPTION CHAR(200) NOT NULL,
    CONTENT TEXT,
    PRIMARY KEY (ARTICLE_ID),
    FOREIGN KEY (CATEGORY_ID) REFERENCES CATEGORIES(CATEGORY_ID)
); 

