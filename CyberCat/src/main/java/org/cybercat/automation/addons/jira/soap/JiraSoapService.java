/**
 * JiraSoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.cybercat.automation.addons.jira.soap;

public interface JiraSoapService extends java.rmi.Remote {
    public org.cybercat.automation.addons.jira.soap.RemoteComment getComment(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteGroup createGroup(java.lang.String in0, java.lang.String in1, org.cybercat.automation.addons.jira.soap.RemoteUser in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteServerInfo getServerInfo(java.lang.String in0) throws java.rmi.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteGroup getGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public java.lang.String login(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteUser getUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssue getIssue(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteComponent[] getComponents(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteUser createUser(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssue createIssue(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteIssue in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssue updateIssue(java.lang.String in0, java.lang.String in1, org.cybercat.automation.addons.jira.soap.RemoteFieldValue[] in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void deleteIssue(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteNamedObject[] getAvailableActions(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssueType[] getSubTaskIssueTypes(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException;
    public org.cybercat.automation.addons.jira.soap.RemoteConfiguration getConfiguration(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteProject createProject(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, org.cybercat.automation.addons.jira.soap.RemotePermissionScheme in6, org.cybercat.automation.addons.jira.soap.RemoteScheme in7, org.cybercat.automation.addons.jira.soap.RemoteScheme in8) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteProject updateProject(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteProject in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteProject getProjectByKey(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void removeAllRoleActorsByProject(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteProject in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemotePriority[] getPriorities(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException;
    public org.cybercat.automation.addons.jira.soap.RemoteResolution[] getResolutions(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssueType[] getIssueTypes(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException;
    public org.cybercat.automation.addons.jira.soap.RemoteStatus[] getStatuses(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException;
    public org.cybercat.automation.addons.jira.soap.RemoteProjectRole[] getProjectRoles(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteProjectRole getProjectRole(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteProjectRoleActors getProjectRoleActors(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteProjectRole in1, org.cybercat.automation.addons.jira.soap.RemoteProject in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteRoleActors getDefaultRoleActors(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteProjectRole in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void removeAllRoleActorsByNameAndType(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void deleteProjectRole(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteProjectRole in1, boolean in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void updateProjectRole(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteProjectRole in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteProjectRole createProjectRole(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteProjectRole in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public boolean isProjectRoleNameUnique(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void addActorsToProjectRole(java.lang.String in0, java.lang.String[] in1, org.cybercat.automation.addons.jira.soap.RemoteProjectRole in2, org.cybercat.automation.addons.jira.soap.RemoteProject in3, java.lang.String in4) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void removeActorsFromProjectRole(java.lang.String in0, java.lang.String[] in1, org.cybercat.automation.addons.jira.soap.RemoteProjectRole in2, org.cybercat.automation.addons.jira.soap.RemoteProject in3, java.lang.String in4) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void addDefaultActorsToProjectRole(java.lang.String in0, java.lang.String[] in1, org.cybercat.automation.addons.jira.soap.RemoteProjectRole in2, java.lang.String in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void removeDefaultActorsFromProjectRole(java.lang.String in0, java.lang.String[] in1, org.cybercat.automation.addons.jira.soap.RemoteProjectRole in2, java.lang.String in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteScheme[] getAssociatedNotificationSchemes(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteProjectRole in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteScheme[] getAssociatedPermissionSchemes(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteProjectRole in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void deleteProject(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteProject getProjectById(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteVersion[] getVersions(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteField[] getCustomFields(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteComment[] getComments(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteFilter[] getFavouriteFilters(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void releaseVersion(java.lang.String in0, java.lang.String in1, org.cybercat.automation.addons.jira.soap.RemoteVersion in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void archiveVersion(java.lang.String in0, java.lang.String in1, java.lang.String in2, boolean in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteField[] getFieldsForEdit(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssueType[] getIssueTypesForProject(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssueType[] getSubTaskIssueTypesForProject(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException;
    public void addUserToGroup(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteGroup in1, org.cybercat.automation.addons.jira.soap.RemoteUser in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void removeUserFromGroup(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteGroup in1, org.cybercat.automation.addons.jira.soap.RemoteUser in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteSecurityLevel getSecurityLevel(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public boolean logout(java.lang.String in0) throws java.rmi.RemoteException;
    public void addComment(java.lang.String in0, java.lang.String in1, org.cybercat.automation.addons.jira.soap.RemoteComment in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteProject getProjectWithSchemesById(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteSecurityLevel[] getSecurityLevels(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteAvatar[] getProjectAvatars(java.lang.String in0, java.lang.String in1, boolean in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void setProjectAvatar(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteAvatar getProjectAvatar(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void deleteProjectAvatar(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteScheme[] getNotificationSchemes(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemotePermissionScheme[] getPermissionSchemes(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemotePermission[] getAllPermissions(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemotePermissionScheme createPermissionScheme(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemotePermissionScheme addPermissionTo(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemotePermissionScheme in1, org.cybercat.automation.addons.jira.soap.RemotePermission in2, org.cybercat.automation.addons.jira.soap.RemoteEntity in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemotePermissionScheme deletePermissionFrom(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemotePermissionScheme in1, org.cybercat.automation.addons.jira.soap.RemotePermission in2, org.cybercat.automation.addons.jira.soap.RemoteEntity in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void deletePermissionScheme(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssue createIssueWithSecurityLevel(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteIssue in1, long in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public boolean addAttachmentsToIssue(java.lang.String in0, java.lang.String in1, java.lang.String[] in2, byte[][] in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteAttachment[] getAttachmentsFromIssue(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public boolean hasPermissionToEditComment(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteComment in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteComment editComment(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteComment in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteField[] getFieldsForAction(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssue progressWorkflowAction(java.lang.String in0, java.lang.String in1, java.lang.String in2, org.cybercat.automation.addons.jira.soap.RemoteFieldValue[] in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssue getIssueById(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteWorklog addWorklogWithNewRemainingEstimate(java.lang.String in0, java.lang.String in1, org.cybercat.automation.addons.jira.soap.RemoteWorklog in2, java.lang.String in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteWorklog addWorklogAndAutoAdjustRemainingEstimate(java.lang.String in0, java.lang.String in1, org.cybercat.automation.addons.jira.soap.RemoteWorklog in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteWorklog addWorklogAndRetainRemainingEstimate(java.lang.String in0, java.lang.String in1, org.cybercat.automation.addons.jira.soap.RemoteWorklog in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void deleteWorklogWithNewRemainingEstimate(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void deleteWorklogAndAutoAdjustRemainingEstimate(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void deleteWorklogAndRetainRemainingEstimate(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void updateWorklogWithNewRemainingEstimate(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteWorklog in1, java.lang.String in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void updateWorklogAndAutoAdjustRemainingEstimate(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteWorklog in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void updateWorklogAndRetainRemainingEstimate(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteWorklog in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteWorklog[] getWorklogs(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public boolean hasPermissionToCreateWorklog(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public boolean hasPermissionToDeleteWorklog(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public boolean hasPermissionToUpdateWorklog(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public java.util.Calendar getResolutionDateByKey(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public java.util.Calendar getResolutionDateById(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public long getIssueCountForFilter(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssue[] getIssuesFromTextSearch(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssue[] getIssuesFromTextSearchWithProject(java.lang.String in0, java.lang.String[] in1, java.lang.String in2, int in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssue[] getIssuesFromJqlSearch(java.lang.String in0, java.lang.String in1, int in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void deleteUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteGroup updateGroup(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteGroup in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void deleteGroup(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void refreshCustomFields(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteFilter[] getSavedFilters(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public boolean addBase64EncodedAttachmentsToIssue(java.lang.String in0, java.lang.String in1, java.lang.String[] in2, java.lang.String[] in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteProject createProjectFromObject(java.lang.String in0, org.cybercat.automation.addons.jira.soap.RemoteProject in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteValidationException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteScheme[] getSecuritySchemes(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteVersion addVersion(java.lang.String in0, java.lang.String in1, org.cybercat.automation.addons.jira.soap.RemoteVersion in2) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssue[] getIssuesFromFilter(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssue[] getIssuesFromFilterWithLimit(java.lang.String in0, java.lang.String in1, int in2, int in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteIssue[] getIssuesFromTextSearchWithLimit(java.lang.String in0, java.lang.String in1, int in2, int in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public org.cybercat.automation.addons.jira.soap.RemoteProject[] getProjectsNoSchemes(java.lang.String in0) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteAuthenticationException, org.cybercat.automation.addons.jira.soap.RemoteException;
    public void setNewProjectAvatar(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException, org.cybercat.automation.addons.jira.soap.RemotePermissionException, org.cybercat.automation.addons.jira.soap.RemoteException;
}
