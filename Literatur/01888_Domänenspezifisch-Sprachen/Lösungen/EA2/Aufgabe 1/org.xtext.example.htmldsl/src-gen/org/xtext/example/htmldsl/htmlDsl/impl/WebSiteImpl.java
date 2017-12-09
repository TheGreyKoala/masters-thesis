/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.htmldsl.htmlDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.htmldsl.htmlDsl.HtmlDslPackage;
import org.xtext.example.htmldsl.htmlDsl.Page;
import org.xtext.example.htmldsl.htmlDsl.WebSite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.htmldsl.htmlDsl.impl.WebSiteImpl#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebSiteImpl extends MinimalEObjectImpl.Container implements WebSite
{
  /**
   * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPages()
   * @generated
   * @ordered
   */
  protected EList<Page> pages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WebSiteImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HtmlDslPackage.Literals.WEB_SITE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Page> getPages()
  {
    if (pages == null)
    {
      pages = new EObjectContainmentEList<Page>(Page.class, this, HtmlDslPackage.WEB_SITE__PAGES);
    }
    return pages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HtmlDslPackage.WEB_SITE__PAGES:
        return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HtmlDslPackage.WEB_SITE__PAGES:
        return getPages();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HtmlDslPackage.WEB_SITE__PAGES:
        getPages().clear();
        getPages().addAll((Collection<? extends Page>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HtmlDslPackage.WEB_SITE__PAGES:
        getPages().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HtmlDslPackage.WEB_SITE__PAGES:
        return pages != null && !pages.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WebSiteImpl
