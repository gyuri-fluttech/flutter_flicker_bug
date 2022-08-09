import 'dart:async';

import 'package:flutter/material.dart';
import 'package:intl/intl.dart';

class LauncherTime extends StatefulWidget {
  const LauncherTime({
    Key? key,
  }) : super(key: key);

  @override
  _LauncherTimeState createState() => _LauncherTimeState();
}

class _LauncherTimeState extends State<LauncherTime> {
  late Timer _timer;

  @override
  void initState() {
    super.initState();

    _timer = Timer.periodic(
      const Duration(milliseconds: 5),
      (Timer t) => setState(() {}),
    );
  }

  @override
  void dispose() {
    _timer.cancel();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    var use24HourFormat = MediaQuery.of(context).alwaysUse24HourFormat;
    var timePattern = 'hh:mm:ss';
    if (use24HourFormat) {
      timePattern = 'HH:mm:ss';
    }
    var currentTime =
        DateFormat(timePattern, Localizations.localeOf(context).toString())
            .format(DateTime.now());
    return Center(child: Text(currentTime));
  }
}
