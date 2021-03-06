package br.com.its.isaude.core.dbunit.config;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

public class DBUnitHibernateUtil {

	private static final String VALIDATOR_CONSTRAINTS_NOT_EMPTY_MESSAGE = "{org.hibernate.validator.constraints.NotEmpty.message}";
	private static final String VALIDATOR_CONSTRAINTS_EMAIL_MESSAGE = "{org.hibernate.validator.constraints.Email.message}";
	private static final String VALIDATOR_CONSTRAINTS_LENGTH_MESSAGE = "{org.hibernate.validator.constraints.Length.message}";
	private static final String VALIDATOR_CONSTRAINTS_NOT_NULL_MESSAGE = "{javax.validation.constraints.NotNull.message}";
	
	public static <T> Long getCountTotalSizeByType(SessionFactory sessionFactory, Class<T> klass) {
		return (Long) sessionFactory.getCurrentSession().createCriteria(klass).setProjection(Projections.rowCount()).uniqueResult();
	}

	public static <T> Set<ConstraintViolation<T>> getViolations(T entity) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<T>> constraintViolations = validator.validate(entity);
		
		return constraintViolations;
		
	}

	public static <T> String getViolationMessageFromEntity(T entity) {
		return getViolations(entity).iterator().next().getMessageTemplate();
	}

	public static String getValidatorConstraintsNotEmptyMessage() {
		return VALIDATOR_CONSTRAINTS_NOT_EMPTY_MESSAGE;
	}
	public static String getValidatorConstraintsNotNullMessage() {
		return VALIDATOR_CONSTRAINTS_NOT_NULL_MESSAGE;
	}

	public static String getValidatorConstraintsLengthMessage() {
		return VALIDATOR_CONSTRAINTS_LENGTH_MESSAGE;
	}

	public static String getValidatorConstraintsEmailMessage() {
		return VALIDATOR_CONSTRAINTS_EMAIL_MESSAGE;
	}

}