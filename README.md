### D365F-O-Technical

## D365FO Interview Questions and Answers

### Table of Contents

| No. | Questions                                                                                                          |
| --- | ------------------------------------------------------------------------------------------------------------------ |
| 1   | [What is Dynamics 365 F&O?](#what-is-dynamics-365-fo)                                                              |
| 2   | [What are OOPS concepts?](#what-are-oops-concepts)                                                                 |
| 3   | [What is AOT in D365FO?](#what-is-aot-in-d365fo)                                                                   |
| 4   | [Interfaces & Abstract Class](#interfaces--abstract-class)                                                         |
| 5   | [What is the concept of extension in D365?](#what-is-the-concept-of-extension-in-d365)                             |
| 6   | [what-are-the-different-types-of-tables-used-in-d365-fo?](#what-are-the-different-types-of-tables-used-in-d365-fo) |
| 7   | [Difference Between TempDB and InMemory Tables?](#difference-between-tempdb-and-inmemory-tables)                   |
| 8   | [what-is-edt-and-base-enum?](#what-is-edt-and-base-enum)                                                           |
| 9   | [what-is-an-index-in-d365-fo?](#what-is-an-index-in-d365-fo)                                                       |
| 10  | [What is Dynamics 365 F&O?](#)                                                                                     |
| 11  | [What is Dynamics 365 F&O?](#)                                                                                     |
| 12  | [What is Dynamics 365 F&O?](#)                                                                                     |
| 13  | [What is Dynamics 365 F&O?](#)                                                                                     |
| 14  | [What is Dynamics 365 F&O?](#)                                                                                     |

1. ### What is Dynamics 365 F&O?

   Microsoft Dynamics 365 FO is a cloud based ERP (Enterprise Resource Planning) platform developed by Microsoft. Microsoft Dynamics 365 Finance & Operations has replaced the previous on premise version Dynamics AX 2012.

   **[⬆ Back to Top](#table-of-contents)**

2. ### What are OOPS concepts?

   The main concepts of OOPS used in D365 FO are:

   Class and Objects
   Data Abstraction: Showing only the essential information and hide background details.
   Encapsulation: Wrapping of data member and method to a single unit.
   Inheritance:-The Flowing of property of parent class to the child class.
   Polymorphism:-The property of using the same method again and again to perform different things.

**[⬆ Back to Top](#table-of-contents)**

3. ### What is AOT in D365FO?

   The Application Object Tree (AOT) is a tree view of all the application objects in Microsoft Dynamics D365FO. The AOT contains every object you need to customize the look and functionality of a Dynamics D365FO application.

**[⬆ Back to Top](#table-of-contents)**

4. ### Interfaces & Abstract Class

   The class implementing is the interface that implements all interface methods and there will not be any abstract Class requirement. There are many access modifiers available like abstract, protected, virtual, internal, public, and many more that are useful in the abstract Classes. Abstract classes will be very fast when compared to interfaces.

   | Interfaces                                                                                                                               | Abstract Class                                                                                    |
   | ---------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
   | The interface is the signature for a particular method.                                                                                  | Abstract class contains both the incomplete or complete methods .                                 |
   | Interface cannot be an implemented method                                                                                                | The abstract class is the implemented method.                                                     |
   | The interfaces does not contain constructors, fields, or destructors but they have only the property’s signature with no implementation. | The abstract class contains constructors, fields, or destructors for implementing the properties. |
   | Interface supports multiple inheritances.                                                                                                | The abstract class does not support multiple inheritances.                                        |
   | The class can also inherit more than one interfaces.                                                                                     | The class can inherit only one abstract class.                                                    |

**[⬆ Back to Top](#table-of-contents)**

5. ### What is the concept of extension in D365?
   An extension is a way to add new functionality to an existing object in D365FO without modifying the base code of that object. Microsoft has added the concept of extension because they don’t want to modify the code base anymore. In this way, it will be easier to upgrade the application code base in the future by Microsoft.

**[⬆ Back to Top](#table-of-contents)**

6. ### What are the different types of Tables used in D365 FO?

   There are 3 types of tables used in D365 FO :

   Regular
   Temp DB
   In Memory

**[⬆ Back to Top](#table-of-contents)**

7.  ### Difference Between TempDB and InMemory Tables?

    There are two types of temporary tables in Dynamics 365 F&O, TempDB tables, and InMemory tables. The differences between them are described in the following grid:

    | InMemory tables                                        | TempDB tables                                                      |
    | ------------------------------------------------------ | ------------------------------------------------------------------ |
    | 1. Holds data temporarily in the client or server tier | 1. Holds data temporarily in the database until the scope is valid |
    | 2. These tables can’t be stored in Database            | 2. These tables are stored in the database                         |
    | 3. Can’t apply security                                | 3. Can apply security                                              |
    | 4. We cannot use InMemory table buffers                | 4. TempDB table buffer can be used in coding                       |

    ### TempDB tables

    We call them TempDB tables because their TableType property value is TempDB. This value comes from the TableType::TempDB enum value. The TableType property value can be set at AOT > Data Dictionary > Tables > MyTempDBTable > Properties > TableType.
    All types of temporary tables are automatically dropped by the system when the table variable in X++ goes out of scope. A TempDB table is NOT dropped when you set its record buffer variable to null.

    ### Capabilities of TempDB Tables:

    1. Can be joined with other AX tables
    2. Can be either per company or global.
    3. Can have foreign key columns.
    4. TempDB tables can be instantiated from the client or server tier.
    5. Can have indexes columns.
    6. Can have methods, but cannot override them.
    7. Usable as a query
    8. No configuration key is required.

    ### Limitations of TempDB Tables:

    1. Cannot be a valid time state table.
    2. Cannot have any delete actions.
    3. No Record Level Security (RLS).
    4. Cannot use the Table browser form.
    5. Cannot be in a table collection.
    6. No view support.

    ### The lifetime of TempDB Tables:

    A TempDB table is instantiated in the underlying database management system when the first SQL operation is sent to the database system from the AOS. (select, insert, update, or delete)

    The situations that cause a TempDB table to be dropped are:

    1. Variable goes out of scope.
    2. A controlled restart of the AOS.
    3. A restart of the database system.
    4. Closure of the AX32.exe client.
    5. From Online Users form.

    ### InMemory tables

    The second type of temporary table is the InMemory table. We call them InMemory tables because their TableType property value is InMemory. This value comes from the TableType::InMemory enum value. The TableType property value can be seen at AOT > Data Dictionary > Tables > MyInMemoryTable > Properties > TableType.

    Note: In Microsoft Dynamics AX 2009 and earlier versions, InMemory tables were called temporary tables. Now there are two kinds of temporary tables, namely InMemory tables and TempDB tables. To avoid confusion we do not use the phrase temporary tables to refer to just InMemory tables or to just TempDB tables.

    Tier: InMemory tables are instantiated in the active memory of whichever tier the process is running on, either the client or the server tier. InMemory tables are never represented in the database management system.
    An InMemory table is held in memory until its size reaches 128 KB. The dataset is then written to a disk file on the server tier.

    Scope: An InMemory table is instantiated when the first record is inserted. The instantiated InMemory table continues to exist only while a record buffer variable that references the table exists. The memory or disk space for the InMemory table is de-allocated as soon as the record buffer goes out of scope.

    Indexes: can be defined on an InMemory table just as you would a persisted table. If an InMemory table is created by copying a persisted table, the indexes are also copied to the InMemory table. Indexes are useful for quickly retrieving data from InMemory tables, especially if the InMemory table data is in a disk file.

**[⬆ Back to Top](#table-of-contents)**

8. ### What is EDT and Base Enum?

   EDT or Extended Data Type and Base Enumerations (Enums) are data types. They are created and managed in the development environment. Extended data types can be primitive data types like integers, strings, real numbers, and booleans. EDT extends the original properties of the data type which they inherit. In addition, some extra properties are added.

   Base enums are a fixed set of values. Those values in database are saved as intigers but they have also name (as referenced from X++ code) and a label (visible to users). You can have up to 255 values for Base enums. The integers in the database will take on the values 0 through 254.

   The AOT in D365FO apps contains many existing EDTs and base enums that can be extended for use in your project, or you can create new data types.

### How to create Extended Data Types – Microsoft Dynamics AX

#### What is an Extended Data Type?

    Extended Data Types are commonly mentioned as EDTs. They extend base types, such as
    Strings, and Integers, by adding properties that affect the looks, behavior, data
    (size), and table reference/relationships. This means we can have types like Customer
    account that has a label, size, table relation information, and other properties that provide
    consistency and greater understanding within the data model.
    Another example of an EDT is Name. Should we change the StringSize property of this
    field, all fields extends this EDT are going to be adjusted; and if we reduce string size, it’ll truncate
    the values to the new size.
    All fields should extend an EDT or an Enum.

##### How to create Extended Data Type?

    We will create an EDT for the Vehicle number. A vehicle table is a similar pattern to
    customers, and vendors, and we will extend the AccountNum Extended Data Type.
    To create the EDT, follow these steps:

1. EDT is created like all new AX artifacts, by pressing
   Control+Shift+A or right-clicking on a folder in the solution explorer and choose Add | New Item.
2. Select EDT String as Data Type.
3. In the Name field, enter ConVehicleId and press Add.
4. Next we need to complete the property sheet, the main properties are covered in
   the following table.
5. If this EDT is to be used as a primary key field, we need to populate the Table References.
6. Press save or save all in the toolbar to save the changes.
   Property Value
   Label Vehicle Id
   Help Text The Vehicle Number
   Extends AccountNum

   ##### Using of EDT

   There is a back and forth element to EDT creation, when we are creating a primary key
   field. We can’t create the field without the EDT, yet we can’t complete the EDT with the
   field being on the table.
   EDTs are types. They must therefore be globally unique amongst all other types, such as
   tables, views, data entities, enums, classes and other EDTs. The EDT’s properties aren’t just
   defaults, but they control behavior too. Should we add an unbound control to a form based
   on an EDT, the EDT can use the Table Reference property to provide a drop down list,
   and the contents will be taken from a field group on the table.

   EDTs can also extend other EDTs, although these child EDTs can only affect appearance
   properties. This is useful when we want to enforce physical storage attributes of a range of
   types, but have a different label depending on context. If we change the size of a base EDT,
   all EDTs that extend it will be affected and consequently all of the fields that are based on
   them.
   We often extend specific EDTs, when creating an EDT for certain types of fields

**[⬆ Back to Top](#table-of-contents)**

9. ### What is an index in D365 FO?

   An index is a table-specific database structure that speeds the retrieval of rows from a table. Indexes are used to improve the performance of data retrieval and occasionally to ensure the existence of unique records.

   There are two types of indexes unique and non-unique. Whether an index is unique is defined by the index’s AllowDuplicates property. When this property is set to No, a unique index is created. The database uses the unique index to ensure that no duplicate key values occur. The database prevents you from inserting records with duplicate key values by rejecting the insert.

**[⬆ Back to Top](#table-of-contents)**

10. ### What are Delete Actions in D365 FO?

    ##### Deleted Actions/ OnDelete with Example – Microsoft Dynamics 365 F&O

        Delete Actions and OnDelete property indicates how deletions in the main table are handled in the related tables or child tables. There are 3 types of options are available i.e. Cascade, Restricted & CascadeRestricted.

        The delete action and OnDelete property (available only for Microsoft D365 finance and operations) help to maintain database consistency.

        Before the release of Microsoft Dynamics 365 for operations , in Microsoft Dynamics AX , there was only one option available i.e Delete Actions.

        But in Microsoft Dynamics 365 finance and operations we have 2 options available. The first one is the traditional approach which was also available in Microsoft Dynamics AX i.e. Delete Actions. The second one is a new approach and recommended in Microsoft Dynamics 365 for finance and operations. This include defining “On Delete” property Below will show some example how to create delete actions using OnDelete properties:

        1.Create 2 tables, parent table and child table.

        ![alt text](image.png)

        2.Add fields in Parent table and Child table, In our case: Id is primary key on parent table and ParentId is foreign key in Child tabe.

        ![alt text](image-1.png)


        3.Create a primary key for Parent table, For this create a Index and set Alternative key true and Allow duplicate set to no.

        ![alt text](image-2.png)

        4. Now expand relationship node of child table and right click than add foreign key relation

        ![alt text](image-3.png)

        In the On Delete property we chose Delete Action Type (In our case Cascade)

        ![alt text](image-4.png)

        Now we can fill our tables with some test Data

        ![alt text](image-5.png)

        If we delete Owner2 in Parent table, the related record in child table will be deleted automatically.


        ![alt text](image-6.png)

    #### Delete Actions Types

        First type and option is CASCADE. For example : If you have one parent table ParentTable and you have one child or related table ChildTable . If you are going to use CASCADE delete action or On delete property then on deletion of records in TABLE ParentTable , related records in TABLE ChildTable will also get deleted. (OurCase)

        Second type and option is RESTRICTED. For example : If you have one parent table ParentTable and you have one child or related table ChildTable. If you are going to use RESTRICTED delete action or On delete property then on deletion of record in TABLE ParentTable , system will not validate records in related Table ChildTable. If related record exits in Table ChildTable then system will not allow you to delete record in Table ParentTable and throw an error.

        Second type and option is CASCADE RESTRICTED. For example : if we have 3 tables i.e. parent table Vehicle & related tables Car & CarManufacturer. Table CarManufacturer is child or related table of Table CAR and similarly Table CAR is child or related table of parent Table Vehicle. If we will set the delete action CASCADE in between Parent Table Vehicle and Related Table CAR and again if we will set the delete action CASCADE RESTRICTED in between Table CAR and Related Table CarManufacturer. Then on deletion of record in Parent TABLE VEHICLE, system will also delete all the related records of TABLE CAR & CarManufacturer. But if you will try to delete records in Car and related records exists in Table CarManufacturer then system will not allow to delete records.

# ===============================================================================================================================================================

# ===================================================

# ==========================================================

# Create deployable packages of models

https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/deployment/create-apply-deployable-package

# MorphX and Intellimorph

https://community.dynamics.com/blogs/post/?postid=748905e7-8caf-4cb7-97fe-3512f2067cb8#:~:text=MorphX%20is%20an%20integrated%20development,to%20use%20this%20MorphX%20IDE.

## Some Blogs Links

https://rockykatoch.wordpress.com/d365fo-interview-questions-answers/

https://14-dynamics365.com/2022/05/24/d365fo-interview-questions-and-answers-2022/

## Dynamics 365 Musings

https://dynamics365musings.com/

## Interview Q&A

# Links

https://14-dynamics365.com/2022/05/24/d365fo-interview-questions-and-answers-2022/

https://ashokkancheti.blogspot.com/2014/03/dynamics-ax-2012-interview-questions.html

https://docs.google.com/document/d/1egdDWYSY3l5B_NYOGDb-UuVnoR6v4q-9IQ0oi_-_1EY/edit#heading=h.1yifwsmtust9

### SSRS Report Generation

https://ax.docentric.com/create-a-new-custom-ssrs-report-in-d365fo/

## Types of Joins in D365 F&O

1)InnerJoin :: An Inner Join returns only the rows where there is a match in both tables based on the join condition.

2)OuterJoin :: An Outer Join returns all rows from both tables, along with matching rows from the tables if any, and null values for non-matching rows.

3)ExistJoin :: It seems like you might be referring to the EXISTS keyword used in SQL. EXISTS is a predicate used in a subquery to test for the existence of rows in a subquery result.

4)NonExitJoin :: There isn't a standard term called "NonExist Join." It might refer to a scenario where you want to retrieve rows from one table where corresponding rows do not exist in another table.

5)Active :: In a database context, "Active" could refer to a state where a database connection or transaction is currently processing or performing operations.

6)Passive :: "Passive" might refer to a state where a database connection or transaction is idle or not actively processing operations.

7)Delyed :: In some contexts, "Delayed" could refer to a feature or mechanism in a database system where certain operations are postponed or executed after a delay.

# There Are 5 different Types of Integration

1)Migration
2)Broadcast
3)Bi-directional sync
4)correlation
5)aggregation

### In Dynamics

# - Batch Integration

The current integration is designed to go through via an API that's developed on Microsoft's Azure's Logic Apps. The high level integration flow is as follows:

1. Generate file

2. POST the data by invoking a Logic Apps RESTful API endpoint.

3. Once the data is received in Logic Apps, the data is processed line by line into D365 FO.

The line by line processing into D365 seems somewhat inefficient, as the number of lines can be fairly large (between 300K - 500K). This could take a while.

Is this the best/recommended approach that Microsoft offers to integrate large subsets of data? Or are there other more "batch-oriented" patterns that can be recommended.

# - Real-Time Integration

https://www.youtube.com/watch?v=m3Rc92c906I

![alt text](AApiM.png)

==> Use Odata Custom Service,Virtual Entities

### D365F&O Odata Integration

https://medium.com/@zia_ur_rahman_dynamics_geek/odata-in-d365-90a84f15751c

https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/data-entities/integration-overview

https://medium.com/@mateen462/integration-with-odata-d365f-o-and-net-12699f6fb7d1

https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/data-entities/odata

## Oauth 2.0

https://learn.microsoft.com/en-us/entra/identity-platform/v2-oauth2-auth-code-flow

## Videos On Integration

https://youtu.be/lFcblRQDeo4?si=d7GaVReNMe0--evj

### Steps To Install OData Client Code Generator to generate client-side proxy class

https://devblogs.microsoft.com/odata/tutorial-sample-how-to-use-odata-client-code-generator-to-generate-client-side-proxy-class/

## D365 F&O Integration with Service Now

https://www.servicenow.com/community/developer-blog/integrate-with-microsoft-dynamics/ba-p/2686446

## AAD(Azure Active Directory)

https://intellipaat.com/blog/azure-active-directory/

https://stackoverflow.com/questions/75751477/how-to-get-a-microsoft-azure-authorization-token

https://learn.microsoft.com/en-us/azure/active-directory-b2c/access-tokens

# What is data Entity

https://dynamics365musings.com/d365-data-entity/

https://dynamics365musings.com/create-a-d365-data-entity/

# FORMS

Form level logic>>

1. form level methods

2. data source level methods

3. data source field level menthods

4. design control level methods

Form creation > menu item > adding meni item in menus

Display MenuItem > form I

Action MenuItem > class

output menuitem > report

#### Form

Form creation > menu item > adding meni item in menus

Display MenuItem > form

Action MenuItem > class

output menuitem > report

# Form method calling sequence

#### form opening

form level > init() >> from DataSource > init()

form level >run() >> from DataSource > executeQuery()

from DataSource > active()

form level > closed()

#### form closing

form level > canClose()

form level > CLose()

form level > Closed()

#### I creating new record in form level

from DataSource > create()

from Datasource > initValue() >> table level >> initvalue()

from DataSource > active()

#### saving record in form level

from DataSource> validatewrite() >>> table level >> validatewrite()

from DataSource > write() >>> table level >> insert()

from DataSource > active()

# Create A New NumberSequence

it will generate new id when we click on a new button

1. Edt string

every module has one num seq class

2. loadModue() to load edt

every module has one parameter table

3. this table is used for setups

4. need create reference

need to run job for number sequence

5. functional setups,

6.nedd to write logic in table initvalue()

###### D365FO Interview Questions and Answers
