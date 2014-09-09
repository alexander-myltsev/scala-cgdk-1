package model

/**
 * Класс, определяющий хоккеиста. Содержит также все свойства юнита.
 */
class Hockeyist(id: Long, playerId: Long, teammateIndex: Int, mass: Double,
                radius: Double, x: Double, y: Double, speedX: Double, speedY: Double,
                angle: Double, angularSpeed: Double, teammate: Boolean, hokeyistType: Option[HockeyistType],
                strength: Int, endurance: Int, dexterity: Int, agility: Int, stamina: Double,
                state: Option[HockeyistState], originalPositionIndex: Int, remainingKnockdownTicks: Int,
                remainingCooldownTicks: Int, swingTicks: Int, lastAction: Option[ActionType],
                lastActionTick: Option[Integer])
  extends Unit(id, mass, radius, x, y, speedX, speedY, angle, angularSpeed)
{

  /**
   * @return Возвращает идентификатор игрока, в команду которого входит хоккеист.
   */
  def getPlayerId: Long = playerId

  /**
   * @return Возвращает 0-индексированный номер хоккеиста в команде.
   */
  def getTeammateIndex: Int = teammateIndex

  /**
   * @return Возвращает { @code true}, если и только если данный хоккеист входит в команду вашего игрока.
   */
  def isTeammate: Boolean = teammate

  /**
   * @return Возвращает тип хоккеиста.
   */
  def getType: Option[HockeyistType] = hokeyistType

  /**
   * @return Возвращает значение атрибута сила.
   */
  def getStrength: Int = strength

  /**
   * @return Возвращает значение атрибута стойкость.
   */
  def getEndurance: Int = endurance

  /**
   * @return Возвращает значение атрибута ловкость.
   */
  def getDexterity: Int = dexterity

  /**
   * @return Возвращает значение атрибута подвижность.
   */
  def getAgility: Int = agility

  /**
   * @return Возвращает текущее значение выносливости.
   */
  def getStamina: Double = stamina

  /**
   * @return Возвращает состояние хоккеиста.
   */
  def getState: Option[HockeyistState] = state

  /**
   * @return Возвращает индекс исходной позиции хоккеиста или { @code -1} для вратаря или хоккеиста,
   *         отдыхающего за пределами игрового поля. На эту позицию хоккеист будет помещён при разыгрывании шайбы.
   *         При выполнении действия замена { @code ActionType.SUBSTITUTE} индексы исходных позиций хоккеистов,
   *         участвующих в замене, меняются местами.
   */
  def getOriginalPositionIndex: Int = originalPositionIndex

  /**
   * @return Возвращает количество тиков, по прошествии которого хоккеист восстановится после падения,
   *         или { @code 0}, если хоккеист не сбит с ног.
   */
  def getRemainingKnockdownTicks: Int = remainingKnockdownTicks

  /**
   * @return Возвращает количество тиков, по прошествии которого хоккеист сможет совершить какое-либо
   *         действие ({ @code move.action}), или { @code 0}, если хоккеист может совершить действие в данный тик.
   */
  def getRemainingCooldownTicks: Int = remainingCooldownTicks

  /**
   * @return Для хоккеиста, находящегося в состоянии замаха ({ @code HockeyistState.SWINGING}),
   *         возвращает количество тиков, прошедших от начала замаха. В противном случае возвращает { @code 0}.
   */
  def getSwingTicks: Int = swingTicks

  /**
   * @return Возвращает последнее действие ({ @code move.action}), совершённое хоккеистом, или { @code None}
   *         в случае, если хоккеист ещё не совершил ни одного действия.
   */
  def getLastAction: Option[ActionType] = lastAction

  /**
   * @return Возвращает номер тика, в который хоккеист совершил своё последние действие ({ @code move.action}),
   *         или { @code None} в случае, если хоккеист ещё не совершил ни одного действия.
   */
  def getLastActionTick: Option[Integer] = lastActionTick
}
