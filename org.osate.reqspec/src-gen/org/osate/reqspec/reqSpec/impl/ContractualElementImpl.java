/**
 */
package org.osate.reqspec.reqSpec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.NamedElement;

import org.osate.alisa.common.common.Description;
import org.osate.alisa.common.common.Rationale;
import org.osate.alisa.common.common.Uncertainty;

import org.osate.categories.categories.RequirementCategory;

import org.osate.reqspec.reqSpec.ContractualElement;
import org.osate.reqspec.reqSpec.ExternalDocument;
import org.osate.reqspec.reqSpec.ReqSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contractual Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.ContractualElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.ContractualElementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.ContractualElementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.ContractualElementImpl#getTargetDescription <em>Target Description</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.ContractualElementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.ContractualElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.ContractualElementImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.ContractualElementImpl#getChangeUncertainty <em>Change Uncertainty</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.ContractualElementImpl#getDocumentRequirement <em>Document Requirement</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.ContractualElementImpl#getDocReference <em>Doc Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContractualElementImpl extends MinimalEObjectImpl.Container implements ContractualElement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected NamedElement target;

  /**
   * The default value of the '{@link #getTargetDescription() <em>Target Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetDescription()
   * @generated
   * @ordered
   */
  protected static final String TARGET_DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetDescription() <em>Target Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetDescription()
   * @generated
   * @ordered
   */
  protected String targetDescription = TARGET_DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected RequirementCategory category;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected Description description;

  /**
   * The cached value of the '{@link #getRationale() <em>Rationale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRationale()
   * @generated
   * @ordered
   */
  protected Rationale rationale;

  /**
   * The cached value of the '{@link #getChangeUncertainty() <em>Change Uncertainty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChangeUncertainty()
   * @generated
   * @ordered
   */
  protected Uncertainty changeUncertainty;

  /**
   * The cached value of the '{@link #getDocumentRequirement() <em>Document Requirement</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentRequirement()
   * @generated
   * @ordered
   */
  protected EList<ContractualElement> documentRequirement;

  /**
   * The cached value of the '{@link #getDocReference() <em>Doc Reference</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocReference()
   * @generated
   * @ordered
   */
  protected EList<ExternalDocument> docReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContractualElementImpl()
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
    return ReqSpecPackage.Literals.CONTRACTUAL_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqSpecPackage.CONTRACTUAL_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqSpecPackage.CONTRACTUAL_ELEMENT__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement getTarget()
  {
    if (target != null && ((EObject)target).eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (NamedElement)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqSpecPackage.CONTRACTUAL_ELEMENT__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(NamedElement newTarget)
  {
    NamedElement oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqSpecPackage.CONTRACTUAL_ELEMENT__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetDescription()
  {
    return targetDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetDescription(String newTargetDescription)
  {
    String oldTargetDescription = targetDescription;
    targetDescription = newTargetDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqSpecPackage.CONTRACTUAL_ELEMENT__TARGET_DESCRIPTION, oldTargetDescription, targetDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementCategory getCategory()
  {
    if (category != null && category.eIsProxy())
    {
      InternalEObject oldCategory = (InternalEObject)category;
      category = (RequirementCategory)eResolveProxy(oldCategory);
      if (category != oldCategory)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqSpecPackage.CONTRACTUAL_ELEMENT__CATEGORY, oldCategory, category));
      }
    }
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementCategory basicGetCategory()
  {
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategory(RequirementCategory newCategory)
  {
    RequirementCategory oldCategory = category;
    category = newCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqSpecPackage.CONTRACTUAL_ELEMENT__CATEGORY, oldCategory, category));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs)
  {
    Description oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqSpecPackage.CONTRACTUAL_ELEMENT__DESCRIPTION, oldDescription, newDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(Description newDescription)
  {
    if (newDescription != description)
    {
      NotificationChain msgs = null;
      if (description != null)
        msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqSpecPackage.CONTRACTUAL_ELEMENT__DESCRIPTION, null, msgs);
      if (newDescription != null)
        msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqSpecPackage.CONTRACTUAL_ELEMENT__DESCRIPTION, null, msgs);
      msgs = basicSetDescription(newDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqSpecPackage.CONTRACTUAL_ELEMENT__DESCRIPTION, newDescription, newDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rationale getRationale()
  {
    return rationale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRationale(Rationale newRationale, NotificationChain msgs)
  {
    Rationale oldRationale = rationale;
    rationale = newRationale;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqSpecPackage.CONTRACTUAL_ELEMENT__RATIONALE, oldRationale, newRationale);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRationale(Rationale newRationale)
  {
    if (newRationale != rationale)
    {
      NotificationChain msgs = null;
      if (rationale != null)
        msgs = ((InternalEObject)rationale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqSpecPackage.CONTRACTUAL_ELEMENT__RATIONALE, null, msgs);
      if (newRationale != null)
        msgs = ((InternalEObject)newRationale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqSpecPackage.CONTRACTUAL_ELEMENT__RATIONALE, null, msgs);
      msgs = basicSetRationale(newRationale, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqSpecPackage.CONTRACTUAL_ELEMENT__RATIONALE, newRationale, newRationale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uncertainty getChangeUncertainty()
  {
    return changeUncertainty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChangeUncertainty(Uncertainty newChangeUncertainty, NotificationChain msgs)
  {
    Uncertainty oldChangeUncertainty = changeUncertainty;
    changeUncertainty = newChangeUncertainty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqSpecPackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY, oldChangeUncertainty, newChangeUncertainty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChangeUncertainty(Uncertainty newChangeUncertainty)
  {
    if (newChangeUncertainty != changeUncertainty)
    {
      NotificationChain msgs = null;
      if (changeUncertainty != null)
        msgs = ((InternalEObject)changeUncertainty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqSpecPackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY, null, msgs);
      if (newChangeUncertainty != null)
        msgs = ((InternalEObject)newChangeUncertainty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqSpecPackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY, null, msgs);
      msgs = basicSetChangeUncertainty(newChangeUncertainty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqSpecPackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY, newChangeUncertainty, newChangeUncertainty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContractualElement> getDocumentRequirement()
  {
    if (documentRequirement == null)
    {
      documentRequirement = new EObjectResolvingEList<ContractualElement>(ContractualElement.class, this, ReqSpecPackage.CONTRACTUAL_ELEMENT__DOCUMENT_REQUIREMENT);
    }
    return documentRequirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternalDocument> getDocReference()
  {
    if (docReference == null)
    {
      docReference = new EObjectContainmentEList<ExternalDocument>(ExternalDocument.class, this, ReqSpecPackage.CONTRACTUAL_ELEMENT__DOC_REFERENCE);
    }
    return docReference;
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
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DESCRIPTION:
        return basicSetDescription(null, msgs);
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__RATIONALE:
        return basicSetRationale(null, msgs);
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
        return basicSetChangeUncertainty(null, msgs);
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DOC_REFERENCE:
        return ((InternalEList<?>)getDocReference()).basicRemove(otherEnd, msgs);
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
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__NAME:
        return getName();
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__TITLE:
        return getTitle();
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__TARGET_DESCRIPTION:
        return getTargetDescription();
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__CATEGORY:
        if (resolve) return getCategory();
        return basicGetCategory();
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DESCRIPTION:
        return getDescription();
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__RATIONALE:
        return getRationale();
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
        return getChangeUncertainty();
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DOCUMENT_REQUIREMENT:
        return getDocumentRequirement();
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DOC_REFERENCE:
        return getDocReference();
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
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__TITLE:
        setTitle((String)newValue);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__TARGET:
        setTarget((NamedElement)newValue);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__TARGET_DESCRIPTION:
        setTargetDescription((String)newValue);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__CATEGORY:
        setCategory((RequirementCategory)newValue);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DESCRIPTION:
        setDescription((Description)newValue);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__RATIONALE:
        setRationale((Rationale)newValue);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
        setChangeUncertainty((Uncertainty)newValue);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DOCUMENT_REQUIREMENT:
        getDocumentRequirement().clear();
        getDocumentRequirement().addAll((Collection<? extends ContractualElement>)newValue);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DOC_REFERENCE:
        getDocReference().clear();
        getDocReference().addAll((Collection<? extends ExternalDocument>)newValue);
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
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__TARGET:
        setTarget((NamedElement)null);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__TARGET_DESCRIPTION:
        setTargetDescription(TARGET_DESCRIPTION_EDEFAULT);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__CATEGORY:
        setCategory((RequirementCategory)null);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DESCRIPTION:
        setDescription((Description)null);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__RATIONALE:
        setRationale((Rationale)null);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
        setChangeUncertainty((Uncertainty)null);
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DOCUMENT_REQUIREMENT:
        getDocumentRequirement().clear();
        return;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DOC_REFERENCE:
        getDocReference().clear();
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
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__TARGET:
        return target != null;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__TARGET_DESCRIPTION:
        return TARGET_DESCRIPTION_EDEFAULT == null ? targetDescription != null : !TARGET_DESCRIPTION_EDEFAULT.equals(targetDescription);
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__CATEGORY:
        return category != null;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DESCRIPTION:
        return description != null;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__RATIONALE:
        return rationale != null;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
        return changeUncertainty != null;
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DOCUMENT_REQUIREMENT:
        return documentRequirement != null && !documentRequirement.isEmpty();
      case ReqSpecPackage.CONTRACTUAL_ELEMENT__DOC_REFERENCE:
        return docReference != null && !docReference.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", title: ");
    result.append(title);
    result.append(", targetDescription: ");
    result.append(targetDescription);
    result.append(')');
    return result.toString();
  }

} //ContractualElementImpl
