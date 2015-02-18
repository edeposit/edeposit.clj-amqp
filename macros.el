(project-shell "*shell*" "/home/jan/work/edeposit.clj-amqp")
(project-shell "*clj-amqp*" "/home/jan/work/edeposit.clj-amqp")
(project-shell "*cmd*" "/home/jan/work/edeposit.clj-amqp")
(project-shell "*tests*" "/home/jan/work/edeposit.clj-amqp")

(project-task send-message "*cmd*" "./send-message.sh")
(project-task run-amqp "*shell*" "lein run -- --amqp")
(project-task lein-compile "*clj-amqp*" "lein compile")

(defun restart-app ()
  (interactive)
  (cider-interactive-eval
   "(ns user)(reset)"))

(defun send-refresh ()
  (interactive)
  (cider-interactive-eval
   "(ns user)(refresh)"))
