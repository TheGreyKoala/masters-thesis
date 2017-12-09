/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.htmldsl.htmlDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.htmldsl.htmlDsl.HtmlDslFactory
 * @model kind="package"
 * @generated
 */
public interface HtmlDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "htmlDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/htmldsl/HtmlDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "htmlDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HtmlDslPackage eINSTANCE = org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.WebSiteImpl <em>Web Site</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.htmldsl.htmlDsl.impl.WebSiteImpl
   * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getWebSite()
   * @generated
   */
  int WEB_SITE = 0;

  /**
   * The feature id for the '<em><b>Pages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_SITE__PAGES = 0;

  /**
   * The number of structural features of the '<em>Web Site</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_SITE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.htmldsl.htmlDsl.impl.PageImpl
   * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getPage()
   * @generated
   */
  int PAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Body Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__BODY_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.BodyElementImpl <em>Body Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.htmldsl.htmlDsl.impl.BodyElementImpl
   * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getBodyElement()
   * @generated
   */
  int BODY_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Body Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.Heading1Impl <em>Heading1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.htmldsl.htmlDsl.impl.Heading1Impl
   * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getHeading1()
   * @generated
   */
  int HEADING1 = 3;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING1__TEXT = BODY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Heading1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING1_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.Heading2Impl <em>Heading2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.htmldsl.htmlDsl.impl.Heading2Impl
   * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getHeading2()
   * @generated
   */
  int HEADING2 = 4;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING2__TEXT = BODY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Heading2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING2_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.ParagraphImpl <em>Paragraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.htmldsl.htmlDsl.impl.ParagraphImpl
   * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getParagraph()
   * @generated
   */
  int PARAGRAPH = 5;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH__TEXT = BODY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Paragraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.AnchorImpl <em>Anchor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.htmldsl.htmlDsl.impl.AnchorImpl
   * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getAnchor()
   * @generated
   */
  int ANCHOR = 6;

  /**
   * The feature id for the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR__DESTINATION = BODY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Anchor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCHOR_FEATURE_COUNT = BODY_ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.htmldsl.htmlDsl.WebSite <em>Web Site</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Site</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.WebSite
   * @generated
   */
  EClass getWebSite();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.htmldsl.htmlDsl.WebSite#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.WebSite#getPages()
   * @see #getWebSite()
   * @generated
   */
  EReference getWebSite_Pages();

  /**
   * Returns the meta object for class '{@link org.xtext.example.htmldsl.htmlDsl.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.htmldsl.htmlDsl.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.htmldsl.htmlDsl.Page#getBodyElements <em>Body Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body Elements</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.Page#getBodyElements()
   * @see #getPage()
   * @generated
   */
  EReference getPage_BodyElements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.htmldsl.htmlDsl.BodyElement <em>Body Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Element</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.BodyElement
   * @generated
   */
  EClass getBodyElement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.htmldsl.htmlDsl.Heading1 <em>Heading1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading1</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.Heading1
   * @generated
   */
  EClass getHeading1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.htmldsl.htmlDsl.Heading1#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.Heading1#getText()
   * @see #getHeading1()
   * @generated
   */
  EAttribute getHeading1_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.example.htmldsl.htmlDsl.Heading2 <em>Heading2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading2</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.Heading2
   * @generated
   */
  EClass getHeading2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.htmldsl.htmlDsl.Heading2#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.Heading2#getText()
   * @see #getHeading2()
   * @generated
   */
  EAttribute getHeading2_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.example.htmldsl.htmlDsl.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paragraph</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.Paragraph
   * @generated
   */
  EClass getParagraph();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.htmldsl.htmlDsl.Paragraph#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.Paragraph#getText()
   * @see #getParagraph()
   * @generated
   */
  EAttribute getParagraph_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.example.htmldsl.htmlDsl.Anchor <em>Anchor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anchor</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.Anchor
   * @generated
   */
  EClass getAnchor();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.htmldsl.htmlDsl.Anchor#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Destination</em>'.
   * @see org.xtext.example.htmldsl.htmlDsl.Anchor#getDestination()
   * @see #getAnchor()
   * @generated
   */
  EReference getAnchor_Destination();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HtmlDslFactory getHtmlDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.WebSiteImpl <em>Web Site</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.htmldsl.htmlDsl.impl.WebSiteImpl
     * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getWebSite()
     * @generated
     */
    EClass WEB_SITE = eINSTANCE.getWebSite();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_SITE__PAGES = eINSTANCE.getWebSite_Pages();

    /**
     * The meta object literal for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.htmldsl.htmlDsl.impl.PageImpl
     * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

    /**
     * The meta object literal for the '<em><b>Body Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__BODY_ELEMENTS = eINSTANCE.getPage_BodyElements();

    /**
     * The meta object literal for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.BodyElementImpl <em>Body Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.htmldsl.htmlDsl.impl.BodyElementImpl
     * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getBodyElement()
     * @generated
     */
    EClass BODY_ELEMENT = eINSTANCE.getBodyElement();

    /**
     * The meta object literal for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.Heading1Impl <em>Heading1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.htmldsl.htmlDsl.impl.Heading1Impl
     * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getHeading1()
     * @generated
     */
    EClass HEADING1 = eINSTANCE.getHeading1();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADING1__TEXT = eINSTANCE.getHeading1_Text();

    /**
     * The meta object literal for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.Heading2Impl <em>Heading2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.htmldsl.htmlDsl.impl.Heading2Impl
     * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getHeading2()
     * @generated
     */
    EClass HEADING2 = eINSTANCE.getHeading2();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADING2__TEXT = eINSTANCE.getHeading2_Text();

    /**
     * The meta object literal for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.ParagraphImpl <em>Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.htmldsl.htmlDsl.impl.ParagraphImpl
     * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getParagraph()
     * @generated
     */
    EClass PARAGRAPH = eINSTANCE.getParagraph();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAGRAPH__TEXT = eINSTANCE.getParagraph_Text();

    /**
     * The meta object literal for the '{@link org.xtext.example.htmldsl.htmlDsl.impl.AnchorImpl <em>Anchor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.htmldsl.htmlDsl.impl.AnchorImpl
     * @see org.xtext.example.htmldsl.htmlDsl.impl.HtmlDslPackageImpl#getAnchor()
     * @generated
     */
    EClass ANCHOR = eINSTANCE.getAnchor();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCHOR__DESTINATION = eINSTANCE.getAnchor_Destination();

  }

} //HtmlDslPackage
