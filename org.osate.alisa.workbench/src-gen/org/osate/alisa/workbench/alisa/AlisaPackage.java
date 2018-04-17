/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 * 
 * See COPYRIGHT file for full details.
 */
package org.osate.alisa.workbench.alisa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.categories.categories.CategoriesPackage;

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
 * @see org.osate.alisa.workbench.alisa.AlisaFactory
 * @model kind="package"
 * @generated
 */
public interface AlisaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "alisa";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.osate.org/alisa/workbench/Alisa";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "alisa";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlisaPackage eINSTANCE = org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.alisa.workbench.alisa.impl.AssuranceCaseImpl <em>Assurance Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.workbench.alisa.impl.AssuranceCaseImpl
   * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getAssuranceCase()
   * @generated
   */
  int ASSURANCE_CASE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE__TITLE = 1;

  /**
   * The feature id for the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE__SYSTEM = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Assurance Plans</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE__ASSURANCE_PLANS = 4;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE__TASKS = 5;

  /**
   * The number of structural features of the '<em>Assurance Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.osate.alisa.workbench.alisa.impl.AssurancePlanImpl <em>Assurance Plan</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.workbench.alisa.impl.AssurancePlanImpl
   * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getAssurancePlan()
   * @generated
   */
  int ASSURANCE_PLAN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN__TITLE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN__TARGET = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Assure</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN__ASSURE = 4;

  /**
   * The feature id for the '<em><b>Assure Self</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN__ASSURE_SELF = 5;

  /**
   * The feature id for the '<em><b>Assure Global</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN__ASSURE_GLOBAL = 6;

  /**
   * The feature id for the '<em><b>Assure Subsystems</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN__ASSURE_SUBSYSTEMS = 7;

  /**
   * The feature id for the '<em><b>Assure All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN__ASSURE_ALL = 8;

  /**
   * The feature id for the '<em><b>Assume Subsystems</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN__ASSUME_SUBSYSTEMS = 9;

  /**
   * The feature id for the '<em><b>Assume All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN__ASSUME_ALL = 10;

  /**
   * The feature id for the '<em><b>Issues</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN__ISSUES = 11;

  /**
   * The number of structural features of the '<em>Assurance Plan</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_PLAN_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link org.osate.alisa.workbench.alisa.impl.AssuranceTaskImpl <em>Assurance Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.workbench.alisa.impl.AssuranceTaskImpl
   * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getAssuranceTask()
   * @generated
   */
  int ASSURANCE_TASK = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_TASK__NAME = CategoriesPackage.CATEGORY_FILTER__NAME;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_TASK__CATEGORY = CategoriesPackage.CATEGORY_FILTER__CATEGORY;

  /**
   * The feature id for the '<em><b>Any Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_TASK__ANY_CATEGORY = CategoriesPackage.CATEGORY_FILTER__ANY_CATEGORY;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_TASK__TITLE = CategoriesPackage.CATEGORY_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_TASK__DESCRIPTION = CategoriesPackage.CATEGORY_FILTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Issues</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_TASK__ISSUES = CategoriesPackage.CATEGORY_FILTER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assurance Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_TASK_FEATURE_COUNT = CategoriesPackage.CATEGORY_FILTER_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.osate.alisa.workbench.alisa.AssuranceCase <em>Assurance Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assurance Case</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCase
   * @generated
   */
  EClass getAssuranceCase();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.workbench.alisa.AssuranceCase#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCase#getName()
   * @see #getAssuranceCase()
   * @generated
   */
  EAttribute getAssuranceCase_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.workbench.alisa.AssuranceCase#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCase#getTitle()
   * @see #getAssuranceCase()
   * @generated
   */
  EAttribute getAssuranceCase_Title();

  /**
   * Returns the meta object for the reference '{@link org.osate.alisa.workbench.alisa.AssuranceCase#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>System</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCase#getSystem()
   * @see #getAssuranceCase()
   * @generated
   */
  EReference getAssuranceCase_System();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.alisa.workbench.alisa.AssuranceCase#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCase#getDescription()
   * @see #getAssuranceCase()
   * @generated
   */
  EReference getAssuranceCase_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.alisa.workbench.alisa.AssuranceCase#getAssurancePlans <em>Assurance Plans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assurance Plans</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCase#getAssurancePlans()
   * @see #getAssuranceCase()
   * @generated
   */
  EReference getAssuranceCase_AssurancePlans();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.alisa.workbench.alisa.AssuranceCase#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceCase#getTasks()
   * @see #getAssuranceCase()
   * @generated
   */
  EReference getAssuranceCase_Tasks();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.workbench.alisa.AssurancePlan <em>Assurance Plan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assurance Plan</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan
   * @generated
   */
  EClass getAssurancePlan();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan#getName()
   * @see #getAssurancePlan()
   * @generated
   */
  EAttribute getAssurancePlan_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan#getTitle()
   * @see #getAssurancePlan()
   * @generated
   */
  EAttribute getAssurancePlan_Title();

  /**
   * Returns the meta object for the reference '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan#getTarget()
   * @see #getAssurancePlan()
   * @generated
   */
  EReference getAssurancePlan_Target();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan#getDescription()
   * @see #getAssurancePlan()
   * @generated
   */
  EReference getAssurancePlan_Description();

  /**
   * Returns the meta object for the reference list '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getAssure <em>Assure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assure</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan#getAssure()
   * @see #getAssurancePlan()
   * @generated
   */
  EReference getAssurancePlan_Assure();

  /**
   * Returns the meta object for the reference list '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getAssureSelf <em>Assure Self</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assure Self</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan#getAssureSelf()
   * @see #getAssurancePlan()
   * @generated
   */
  EReference getAssurancePlan_AssureSelf();

  /**
   * Returns the meta object for the reference list '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getAssureGlobal <em>Assure Global</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assure Global</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan#getAssureGlobal()
   * @see #getAssurancePlan()
   * @generated
   */
  EReference getAssurancePlan_AssureGlobal();

  /**
   * Returns the meta object for the reference list '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getAssureSubsystems <em>Assure Subsystems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assure Subsystems</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan#getAssureSubsystems()
   * @see #getAssurancePlan()
   * @generated
   */
  EReference getAssurancePlan_AssureSubsystems();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.workbench.alisa.AssurancePlan#isAssureAll <em>Assure All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assure All</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan#isAssureAll()
   * @see #getAssurancePlan()
   * @generated
   */
  EAttribute getAssurancePlan_AssureAll();

  /**
   * Returns the meta object for the reference list '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getAssumeSubsystems <em>Assume Subsystems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assume Subsystems</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan#getAssumeSubsystems()
   * @see #getAssurancePlan()
   * @generated
   */
  EReference getAssurancePlan_AssumeSubsystems();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.workbench.alisa.AssurancePlan#isAssumeAll <em>Assume All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assume All</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan#isAssumeAll()
   * @see #getAssurancePlan()
   * @generated
   */
  EAttribute getAssurancePlan_AssumeAll();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getIssues <em>Issues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issues</em>'.
   * @see org.osate.alisa.workbench.alisa.AssurancePlan#getIssues()
   * @see #getAssurancePlan()
   * @generated
   */
  EAttribute getAssurancePlan_Issues();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.workbench.alisa.AssuranceTask <em>Assurance Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assurance Task</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceTask
   * @generated
   */
  EClass getAssuranceTask();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.workbench.alisa.AssuranceTask#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceTask#getTitle()
   * @see #getAssuranceTask()
   * @generated
   */
  EAttribute getAssuranceTask_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.alisa.workbench.alisa.AssuranceTask#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceTask#getDescription()
   * @see #getAssuranceTask()
   * @generated
   */
  EReference getAssuranceTask_Description();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.alisa.workbench.alisa.AssuranceTask#getIssues <em>Issues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issues</em>'.
   * @see org.osate.alisa.workbench.alisa.AssuranceTask#getIssues()
   * @see #getAssuranceTask()
   * @generated
   */
  EAttribute getAssuranceTask_Issues();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AlisaFactory getAlisaFactory();

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
     * The meta object literal for the '{@link org.osate.alisa.workbench.alisa.impl.AssuranceCaseImpl <em>Assurance Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.workbench.alisa.impl.AssuranceCaseImpl
     * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getAssuranceCase()
     * @generated
     */
    EClass ASSURANCE_CASE = eINSTANCE.getAssuranceCase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_CASE__NAME = eINSTANCE.getAssuranceCase_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_CASE__TITLE = eINSTANCE.getAssuranceCase_Title();

    /**
     * The meta object literal for the '<em><b>System</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_CASE__SYSTEM = eINSTANCE.getAssuranceCase_System();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_CASE__DESCRIPTION = eINSTANCE.getAssuranceCase_Description();

    /**
     * The meta object literal for the '<em><b>Assurance Plans</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_CASE__ASSURANCE_PLANS = eINSTANCE.getAssuranceCase_AssurancePlans();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_CASE__TASKS = eINSTANCE.getAssuranceCase_Tasks();

    /**
     * The meta object literal for the '{@link org.osate.alisa.workbench.alisa.impl.AssurancePlanImpl <em>Assurance Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.workbench.alisa.impl.AssurancePlanImpl
     * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getAssurancePlan()
     * @generated
     */
    EClass ASSURANCE_PLAN = eINSTANCE.getAssurancePlan();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_PLAN__NAME = eINSTANCE.getAssurancePlan_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_PLAN__TITLE = eINSTANCE.getAssurancePlan_Title();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_PLAN__TARGET = eINSTANCE.getAssurancePlan_Target();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_PLAN__DESCRIPTION = eINSTANCE.getAssurancePlan_Description();

    /**
     * The meta object literal for the '<em><b>Assure</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_PLAN__ASSURE = eINSTANCE.getAssurancePlan_Assure();

    /**
     * The meta object literal for the '<em><b>Assure Self</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_PLAN__ASSURE_SELF = eINSTANCE.getAssurancePlan_AssureSelf();

    /**
     * The meta object literal for the '<em><b>Assure Global</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_PLAN__ASSURE_GLOBAL = eINSTANCE.getAssurancePlan_AssureGlobal();

    /**
     * The meta object literal for the '<em><b>Assure Subsystems</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_PLAN__ASSURE_SUBSYSTEMS = eINSTANCE.getAssurancePlan_AssureSubsystems();

    /**
     * The meta object literal for the '<em><b>Assure All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_PLAN__ASSURE_ALL = eINSTANCE.getAssurancePlan_AssureAll();

    /**
     * The meta object literal for the '<em><b>Assume Subsystems</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_PLAN__ASSUME_SUBSYSTEMS = eINSTANCE.getAssurancePlan_AssumeSubsystems();

    /**
     * The meta object literal for the '<em><b>Assume All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_PLAN__ASSUME_ALL = eINSTANCE.getAssurancePlan_AssumeAll();

    /**
     * The meta object literal for the '<em><b>Issues</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_PLAN__ISSUES = eINSTANCE.getAssurancePlan_Issues();

    /**
     * The meta object literal for the '{@link org.osate.alisa.workbench.alisa.impl.AssuranceTaskImpl <em>Assurance Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.workbench.alisa.impl.AssuranceTaskImpl
     * @see org.osate.alisa.workbench.alisa.impl.AlisaPackageImpl#getAssuranceTask()
     * @generated
     */
    EClass ASSURANCE_TASK = eINSTANCE.getAssuranceTask();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_TASK__TITLE = eINSTANCE.getAssuranceTask_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_TASK__DESCRIPTION = eINSTANCE.getAssuranceTask_Description();

    /**
     * The meta object literal for the '<em><b>Issues</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_TASK__ISSUES = eINSTANCE.getAssuranceTask_Issues();

  }

} //AlisaPackage
